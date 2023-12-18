import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        for (long i = 0; i < k; i++) {
            a /= 2;
            b += a;
            long wk = a;
            a = b; b = wk;
        }
        if (k % 2 != 0) {
            long wk = a;
            a = b;
            b = wk;
        }

        System.out.println(a + " " + b);
    }
}