import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    long n, s;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextLong();
        s = sc.nextLong();
        solve();
    }

    void solve() {
        long sqrtN = (long)Math.sqrt(n);
        long minSumDigits = Long.MAX_VALUE;
        long minB = -1;
        if (n <= s) {
            if (n == s) {
                minB = n + 1;
            }
            System.out.println(minB);
            return;
        }
        for (int b = 2; b < sqrtN; b++) {
            long copyN = n;
            long sumDigits = 0;
            while (copyN > 0) {
                sumDigits += copyN % b;
                copyN /= b;
            }
            if (sumDigits == s && minSumDigits > sumDigits) {
                minSumDigits = sumDigits;
                minB = b;
                break;
            }
        }
        if (minB == -1) {
            for (int p = 1; p < sqrtN; p++) {
                long b = (n - s)/ p + 1;
                long copyN = n;
                long sumDigits = 0;
                while (copyN > 0) {
                    sumDigits += copyN % b;
                    copyN /= b;
                }
                if (sumDigits == s && minSumDigits > sumDigits) {
                    minSumDigits = sumDigits;
                    minB = b;
                }
            }
        }
        System.out.println(minB);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
