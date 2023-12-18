import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            String s = in.nextString() + "00";

            List<Integer> list = new ArrayList<>();
            int cnt = 0;
            boolean prevIsZero = true;
            long ans = 0;
            for (int i = 0; i < s.length(); i++) {
                // 0のとき
                if (s.charAt(i) == '0') {

                    // 直前も0のとき
                    if (prevIsZero) {
                        if (list.size() >= 2) {
                            int remain = 0;
                            int nothing = 0;
                            int bollow = list.get(0);

                            for (int j = 1; j < list.size(); j++) {
                                int nextRemain = Math.max(remain + list.get(j) - 1, nothing);
                                if (list.get(j) > 1) {
                                    nextRemain = Math.max(nextRemain, bollow);
                                }
                                int nextNothing = Math.max(remain + list.get(j), bollow);
                                int nextBollow = Math.max(nothing + list.get(j), bollow + list.get(j) - 1);

                                remain = nextRemain;
                                nothing = nextNothing;
                                if (j < list.size() - 1) {
                                    bollow = nextBollow;
                                }
                            }

                            ans += nothing;
                        }
                        list.clear();
                    }
                    // 直前が1のとき
                    else {
                        list.add(cnt);
                        cnt = 0;
                        prevIsZero = true;
                    }
                }
                // 1のとき
                else {
                    cnt++;
                    prevIsZero = false;
                }
            }

            out.println(ans);
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

