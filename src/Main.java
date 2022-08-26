import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birbirinden farklı üç sayı giriniz!");
        System.out.print("1. sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        c = input.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.print("Sayıların sıralaması: " + a + " < " + b + " < " + c);
            } else {
                System.out.print("Sayıların sıralaması: " + a + " < " + c + " < " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.print("Sayıların sıralaması: " + b + " < " + a + " < " + c);
            } else {
                System.out.print("Sayıların sıralaması: " + b + " < " + c + " < " + a);
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.print("Sayıların sıralaması: " + c + " < " + a + " < " + b);
            } else {
                System.out.print("Sayıların sıralaması: " + c + " < " + b + " < " + a);
            }
        }
    }
}
