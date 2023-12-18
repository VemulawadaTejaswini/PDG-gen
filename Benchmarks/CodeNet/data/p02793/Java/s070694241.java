import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static long gcd(long n, long m) {
        long temp;
        while (m % n != 0)
        {
            temp = n;
            n = m % n;
            m = temp;
        }
        return n;
    }

    public static long lcm(long n, long m) {
        return n * m / gcd(n,m);
    }

    public static void exec(InputStream in, PrintStream out){
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long lcm = a[0];
        for (int i = 1; i < n; i++) {
            lcm = lcm(lcm, a[i]);
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += lcm / a[i];
            result %= (long)(1e9 + 7);
        }

        out.println(result);
    }

    public static void main(String[] args) {
        exec(System.in, System.out);
    }
}