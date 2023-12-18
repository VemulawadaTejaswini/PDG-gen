import java.util.Scanner;

public class Main {

    public static void num(int a, int b, int k) {
        if (a >= k) {
            System.out.println((a - k) + " " + b);
        } else if (k >= (a + b)) {
            System.out.println(0 + " " + 0);
        } else if (k >= a && k <= b) {
            System.out.println(0 + " " + (b - (k - a)));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int k = s.nextInt();
        num(a, b, k);
    }
}
