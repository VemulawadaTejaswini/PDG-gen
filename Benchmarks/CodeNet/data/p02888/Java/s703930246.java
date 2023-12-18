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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] l = new int[n];
            for (int i = 0; i < n; i++)
                l[i] = in.nextInt();
            Arrays.sort(l);
            int ans = 0;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    int a = l[i];
                    int b = l[j];
                    int min = Math.max(a - b, b - a) + 1;
                    int max = a + b - 1;
                    int lowerBound = lowerBound(j + 1, l, min);
                    int upperBound = upperBound(j + 1, l, max);
                    if (lowerBound != -1 && upperBound != -1) {
                        if (lowerBound <= upperBound)
                            ans += upperBound - lowerBound + 1;
                    }
                }
            }
            out.println(ans);
        }

        private int lowerBound(int l, int[] ar, int val) {
            int remL = l;
            l--;
            int r = ar.length;
            while (l + 1 < r) {
                int mid = (l + r) / 2;
                if (ar[mid] == val)
                    return mid;
                if (ar[mid] < val)
                    l = mid;
                else
                    r = mid;
            }
            int L = Math.max(remL, l);
            int R = Math.min(ar.length - 1, r);
            for (int i = L; i <= R; i++)
                if (ar[i] >= val)
                    return i;
            return -1;
        }

        private int upperBound(int l, int[] ar, int val) {
            l--;
            int r = ar.length;
            while (l + 1 < r) {
                int mid = (l + r) / 2;
                if (ar[mid] == val)
                    return mid;
                if (ar[mid] < val)
                    l = mid;
                else
                    r = mid;
            }
            int L = Math.max(0, l);
            int R = Math.min(ar.length - 1, r);
            for (int i = R; i >= L; i--)
                if (ar[i] <= val)
                    return i;
            return -1;
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

