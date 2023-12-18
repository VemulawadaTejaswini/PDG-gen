import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int n = pint();
        long[] a = new long[n];
        for(int i=0;i<n;i++) {
            a[i] = plong();
        }

        long res = 1;
        for(int i=0;i<n;i++) {
            res *= a[i] / gcd(res,a[i]);
        }
        out(res);
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
    }

    private long plong() throws IOException {
        return plong(rd.readLine());
    }

    private long plong(String s) {
        return Long.parseLong(s);
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
