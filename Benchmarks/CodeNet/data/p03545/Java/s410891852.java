import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int A, B, C, D, a, b, c, d, e, f, g,h;

        D = input % 10;
        input /= 10;
        C = input % 10;
        input /= 10;
        B = input % 10;
        input /= 10;
        A = input % 10;
        input /= 10;

        a = A + B + C + D;
        b = A - B + C + D;
        c = A + B - C + D;
        d = A + B + C - D;
        e = A - B - C + D;
        f = A + B - C - D;
        g = A - B + C - D;
        h = A - B - C - D;

        if (a == 7) {
            System.out.println(A + "+" + B + "+" + C + "+" + D +"=7");
        } else if (b == 7) {
            System.out.println(A + "-" + B + "+" + C + "+" + D +"=7");
        } else if (c == 7) {
            System.out.println(A + "+" + B + "-" + C + "+" + D+"=7");
        } else if (d == 7) {
            System.out.println(A + "+" + B + "+" + C + "-" + D+"=7");
        } else if (e == 7) {
            System.out.println(A + "-" + B + "-" + C + "+" + D+"=7");
        } else if (f == 7) {
            System.out.println(A + "+" + B + "-" + C + "-" + D+"=7");
        } else if (g == 7) {
            System.out.println(A + "-" + B + "+" + C + "-" + D+"=7");
        }else if (h == 7) {
            System.out.println(A + "-" + B + "-" + C + "-" + D+"=7");
        }
    }
}