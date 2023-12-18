import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TimeGap solver = new TimeGap();
        solver.solve(1, in, out);
        out.close();
    }

    static class TimeGap {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int[] D = new int[N + 1];
            int[] cnt = new int[13];
            cnt[0] = 1;
            for (int i = 1; i <= N; i++) {
                D[i] = in.nextInt();
                cnt[D[i]]++;
            }
            if (cnt[0] >= 2 || cnt[12] >= 2) {
                out.println(0);
                return;
            }

            for (int i = 1; i <= 11; i++) {
                if (cnt[i] > 2) {
                    out.println(0);
                    return;
                }
            }

            out.println(find(0, 0, cnt, new int[N + 1]));
        }

        private int find(int idx, int candIdx, int[] cnt, int[] cand) {
            if (idx == 13) {
                return findMinGap(cand.clone());
            }

            if (cnt[idx] == 0) return find(idx + 1, candIdx, cnt, cand);

            if (idx == 0 || idx == 12) {
                cand[candIdx] = idx;
                return find(idx + 1, candIdx + 1, cnt, cand);
            }
            if (cnt[idx] == 1) {
                cand[candIdx] = idx;
                int a1 = find(idx + 1, candIdx + 1, cnt, cand);
                cand[candIdx] = 24 - idx;
                int a2 = find(idx + 1, candIdx + 1, cnt, cand);
                return Math.max(a1, a2);
            }
            cand[candIdx] = idx;
            cand[candIdx + 1] = 24 - idx;

            return find(idx + 1, candIdx + 2, cnt, cand);
        }

        private int findMinGap(int[] arr) {
            int N = arr.length;
            int ans = Integer.MAX_VALUE;
            Arrays.sort(arr);
            for (int i = 1; i < N; i++) {
                ans = Math.min(ans, Math.abs(arr[i] - arr[i - 1]));
            }
            ans = Math.min(ans, 24 - arr[N - 1]);
            return ans;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

