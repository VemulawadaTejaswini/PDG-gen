import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int[] ABC = in.Int(3);

            List<Character> ans = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                String s = in.next();
                int l = s.charAt(0) - 'A';
                int r = s.charAt(1) - 'A';
                if (ABC[l] == 0 && ABC[r] == 0) {
                    out.println("No");
                    return;
                } else if (ABC[l] == 0 || ABC[r] == 0) {
                    if (ABC[l] == 0) {
                        ans.add((char) (l + 'A'));
                        ABC[l]++;
                        ABC[r]--;
                    } else {
                        ans.add((char) (r + 'A'));
                        ABC[r]++;
                        ABC[l]--;
                    }
                } else {
                    if (ABC[l] > ABC[r]) {
                        int temp = l;
                        l = r;
                        r = temp;
                    }
                    ans.add((char) (l + 'A'));
                    ABC[l]++;
                    ABC[r]--;
                }
            }
            out.println("Yes");
            ans.forEach(c -> out.println((char) c));
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}

