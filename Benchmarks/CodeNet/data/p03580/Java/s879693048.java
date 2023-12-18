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
                if (s.charAt(i) == '0') {
                    if (prevIsZero) {
                        if (list.size() >= 2) {
                            int notRemain = 0;
                            int remain = Integer.MIN_VALUE / 2;
                            for (int j = 0; j < list.size(); j++) {
                                int newNotRemain = Math.max(remain + list.get(j), notRemain);
                                int newRemain;
                                if (list.get(j) == 1) {
                                    newRemain = notRemain;
                                } else {
                                    newRemain = Math.max(notRemain, remain + list.get(j) - 1);
                                }

                                notRemain = newNotRemain;
                                remain = newRemain;
                            }

                            ans += Math.max(notRemain, remain);
                        }
                        list.clear();
                    } else {
                        list.add(cnt);
                        cnt = 0;
                        prevIsZero = true;
                    }
                } else {
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

