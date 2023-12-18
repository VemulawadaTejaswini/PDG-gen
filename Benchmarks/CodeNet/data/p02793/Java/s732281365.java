import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
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

    public static BigInteger lcm(BigInteger n, BigInteger m) {
        return n.multiply(m).divide(n.gcd(m));
    }

    public static void exec(InputStream in, PrintStream out){
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = BigInteger.valueOf(sc.nextInt());
        }
        BigInteger lcm = a[0];
        for (int i = 1; i < n; i++) {
            lcm = lcm(lcm, a[i]);
        }
        BigInteger result = BigInteger.ZERO;
        BigInteger mod = BigInteger.valueOf((long)1e9 + 7);
        for (int i = 0; i < n; i++) {
            result = result.add(lcm.divide(a[i])).mod(mod);
        }

        out.println(result);
    }

    public static void main(String[] args) {
        exec(System.in, System.out);
    }
}