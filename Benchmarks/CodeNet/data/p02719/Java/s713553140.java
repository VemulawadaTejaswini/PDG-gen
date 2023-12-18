import java.io.*;
import java.util.*;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        pw.println(greedy(n,k));
        pw.close();
    }

    private static long greedy(long n, long k) {
        for (long b = n; b >= 1; b /= 2) {
            while (oper(n, k, b) < n) {
                n = oper(n, k, b);
            }
        }
        return n;
    }

    private static long oper(long n, long k, long numTimes) {
        for (long b = numTimes / 2; b >= 1; b /= 2) {
            while ((n - k * b) >= 0) {
                n -= k * b;
                numTimes -= b;
            }
        }

        for (int i = 0; i < numTimes; i++) {
            long newN = abs(n - k);
            if (newN < n) n = newN;
            else break;
        }

        return n;
    }
}