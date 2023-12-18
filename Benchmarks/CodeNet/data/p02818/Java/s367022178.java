import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if (k > 0) {
            if (a > k) {
                long tmp = a - k;
                k -= a;
                a = tmp;
            } else {
                k -= a;
                a = 0;
            }
        }

        if (k > 0) {
            if (b > k) {
                long tmp = b - k;
                k -= b;
                b = tmp;
            } else {
                k -= b;
                b = 0;
            }
        }

        System.out.println(a + " " + b);
    }

}
