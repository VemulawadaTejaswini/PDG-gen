import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Formula solver = new Formula();
        solver.solve(1, in, out);
        out.close();
    }

    static class Formula {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int[] arr = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i] = s[i] - '0';
            }
            int mask = 1 << 3;
            for (int i = 1; i < mask; i++) {
                int sum = arr[0];
                String vals = "";
                for (int j = 1; j < s.length; j++) {
                    if ((i & (1 << j)) == 0) {
                        sum += arr[j];
                        vals += "+";
                    } else {
                        sum -= arr[j];
                        vals += "-";
                    }
                }
                if (sum == 7) {
                    StringBuilder ans = new StringBuilder();
                    int j = 1, k = 0;
                    ans.append(arr[0]);
                    while (j < s.length) {
                        ans.append(vals.charAt(k++));
                        ans.append(arr[j++]);
                    }
                    out.println(ans.toString() + "=7");
                    return;
                }
            }
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

    }
}

