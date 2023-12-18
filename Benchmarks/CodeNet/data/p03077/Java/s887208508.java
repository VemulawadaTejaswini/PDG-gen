package src;

import IO.InputReader;

import java.io.PrintWriter;

public class CFiveTransportations {
    static double EPS = 1e-6;
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n = in.nextLong(), a[] = new long[5];
        for (int i = 0; i < 5; ++i) a[i] = in.nextInt();
        long m = a[0];
        for (int i = 1; i < 5; ++i) m = Math.min(m, a[i]);
        if (m >= n) out.println(5);
        else out.println((long)Math.ceil(n * 1.0 / m + EPS) + 4);
    }
}
