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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int l = s.length();
            int r1 = f1(s, l);
            int r2 = f2(s, l);
            if (r1 == -1 && r2 == -1) {
                int[] t = new int[1];
                out.println(t[111]);
            }
            if (r1 == -1 && r2 != -1) {
                out.println(r2);
            }
            if (r1 != -1 && r2 == -1) {
                out.println(r1);
            }
            if (r1 != -1 && r2 != -1) {
                out.println(Math.max(r1, r2));
            }
        }

        private static int f1(String s, int l) {
            char last = '#';
            int ans = 0;
            int lastLen = 0;
            int curLen = 0;
            for (int i = 0; i < l; i++) {
                char cur = s.charAt(i);
                curLen++;
                if (curLen == 2) {
                    ans++;
                    lastLen = 2;
                    last = cur;
                    curLen = 0;
                    continue;
                }
                if (lastLen == 0) {
                    ans++;
                    lastLen = 1;
                    last = cur;
                    curLen = 0;
                } else {
                    if (lastLen == 2) {
                        ans++;
                        lastLen = 1;
                        last = cur;
                        curLen = 0;
                    } else {
                        if (last != cur) {
                            ans++;
                            lastLen = 1;
                            last = cur;
                            curLen = 0;
                        }
                    }
                }
            }
            if (curLen == 0)
                return ans;
            else
                return -1;
        }

        private static int f2(String s, int l) {
            char last = s.charAt(0);
            int ans = 0;
            int lastLen = 0;
            int curLen = 1;
            for (int i = 1; i < l; i++) {
                char cur = s.charAt(i);
                curLen++;
                if (curLen == 2) {
                    ans++;
                    lastLen = 2;
                    last = cur;
                    curLen = 0;
                    continue;
                }
                if (lastLen == 0) {
                    ans++;
                    lastLen = 1;
                    last = cur;
                    curLen = 0;
                } else {
                    if (lastLen == 2) {
                        ans++;
                        lastLen = 1;
                        last = cur;
                        curLen = 0;
                    } else {
                        if (last != cur) {
                            ans++;
                            lastLen = 1;
                            last = cur;
                            curLen = 0;
                        }
                    }
                }
            }
            if (curLen == 0)
                return ans;
            else
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

    }
}