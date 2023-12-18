import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abcd = sc.nextInt();
        int tmp = abcd;
        int a = tmp / 1000;
        int b = (tmp / 100) % 10;
        int c = (tmp / 10) % 10;
        int d = (tmp) % 10;
        boolean finish;
        String ans = "aa";

        if (7 == a + b + c + d) {
            ans = a + "+" + b + "+" + c + "+" + d;
        }
        if (7 == a + b + c - d) {
            ans = a + "+" + b + "+" + c + "-" + d;
        }
        if (7 == a + b - c - d) {
            ans = a + "+" + b + "-" + c + "-" + d;
        }
        if (7 == a + b - c + d) {
            ans = a + "+" + b + "-" + c + "+" + d;
        }
        if (7 == a - b + c - d) {
            ans = a + "-" + b + "+" + c + "-" + d;
        }
        if (7 == a - b + c + d) {
            ans = a + "-" + b + "+" + c + "+" + d;
        }
        if (7 == a - b - c - d) {
            ans = a + "-" + b + "-" + c + "-" + d;
        }
        if (7 == a - b - c + d) {
            ans = a + "-" + b + "-" + c + "+" + d;
        }

        System.out.println(ans + "=7");
    }
}