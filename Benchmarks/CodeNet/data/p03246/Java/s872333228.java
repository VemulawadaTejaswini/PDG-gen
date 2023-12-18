import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        a minChanges(int[] a, int off) {
            int[] dp = new int[100_001];
            int m = 0;
            for (int i = off; i < a.length; i += 2) {
                dp[a[i]]++;
                m++;
            }
            a res = new a();
            int max1Index = -1;
            int max2Index = -1;
            for (int i = 1; i < dp.length; i++) {
                if (max2Index == -1 || dp[i] > dp[max2Index]) {
                    if (max1Index == -1 || dp[i] > dp[max1Index]) {
                        max2Index = max1Index;
                        max1Index = i;
                    } else {
                        max2Index = i;
                    }
                }
            }
            res.a1 = max1Index;
            res.a2 = max2Index;
            res.n1 = m - dp[max1Index];
            res.n2 = m - dp[max2Index];
            return res;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.NextInt();
            int[] v = in.NextIntArray(n);
            a res1 = minChanges(v, 0), res2 = minChanges(v, 1);
            if (res1.a1 == res2.a1) {
                out.println(
                        Math.max(
                                res1.n1 + res2.n2
                                ,
                                res1.n2 + res2.n1
                        ));
            } else {
                out.println(res1.n1 + res2.n1);
            }
        }

        class a {
            int a1;
            int n1;
            int a2;
            int n2;

        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() + offset;
            }
            return a;
        }

    }
}

