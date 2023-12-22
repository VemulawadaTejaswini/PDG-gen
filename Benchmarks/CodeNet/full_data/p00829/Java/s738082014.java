import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        LeakyCryptography solver = new LeakyCryptography();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }

    static class LeakyCryptography {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int N = 8;
            final long MOD = 1l << 32;
            long[] hex = new long[N];
            for (int i = 0; i < N; i++) {
                hex[i] = Long.parseLong(in.next(), 16);
            }
            long checkSum = Long.parseLong(in.next(), 16);
            long K = 0;
            for (int i = 0; i < 32; i++) {
                long sum = 0;
                long preK = K;
                K |= (1l << i);
                for (int j = 0; j < N; j++) {
                    sum += (hex[j] ^ K);
                    sum %= MOD;
                }
                if ((sum & (1l << i)) != ((checkSum ^ K) & (1l << i))) {
                    K &= preK;
                }
            }
            out.println(Long.toHexString(K));
        }

    }
}