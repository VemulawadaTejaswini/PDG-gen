import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FThreeVariablesGame solver = new FThreeVariablesGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class FThreeVariablesGame {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] a = {s.nextInt(), s.nextInt(), s.nextInt()};
            ArrayList<Character> ans = new ArrayList<>();
            String st = s.next();
            for (int i = 0; i < n - 1; i++) {
                String next = s.next();
                if (st.equals(next)) {
                    if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                        ans.add(st.charAt(1));
                        a[st.charAt(0) - 'A']--;
                        a[st.charAt(1) - 'A']++;
                    } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                        ans.add(st.charAt(0));
                        a[st.charAt(1) - 'A']--;
                        a[st.charAt(0) - 'A']++;
                    } else if (a[st.charAt(0) - 'A'] > 0) {
                        ans.add(st.charAt(1));
                        a[st.charAt(0) - 'A']--;
                        a[st.charAt(1) - 'A']++;
                    } else {
                        w.println("No");
                        return;
                    }
                } else if (st.equals("AB")) {
                    if (next.equals("AC")) {
                        if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > 0) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else {
                            w.println("No");
                            return;
                        }
                    } else {
                        if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else if (a[st.charAt(0) - 'A'] > 0) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else {
                            w.println("No");
                            return;
                        }
                    }
                } else if (st.equals("AC")) {
                    if (next.equals("AB")) {
                        if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > 0) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else {
                            w.println("No");
                            return;
                        }
                    } else {
                        if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else if (a[st.charAt(0) - 'A'] > 0) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else {
                            w.println("No");
                            return;
                        }
                    }
                } else if (st.equals("BC")) {
                    if (next.equals("AB")) {
                        if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > 0) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else {
                            w.println("No");
                            return;
                        }
                    } else {
                        if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                            ans.add(st.charAt(0));
                            a[st.charAt(1) - 'A']--;
                            a[st.charAt(0) - 'A']++;
                        } else if (a[st.charAt(0) - 'A'] > 0) {
                            ans.add(st.charAt(1));
                            a[st.charAt(0) - 'A']--;
                            a[st.charAt(1) - 'A']++;
                        } else {
                            w.println("No");
                            return;
                        }
                    }
                }
                st = next;
            }
            if (a[st.charAt(0) - 'A'] > a[st.charAt(1) - 'A']) {
                ans.add(st.charAt(1));
                a[st.charAt(0) - 'A']--;
                a[st.charAt(1) - 'A']++;
            } else if (a[st.charAt(1) - 'A'] > a[st.charAt(0) - 'A']) {
                ans.add(st.charAt(0));
                a[st.charAt(1) - 'A']--;
                a[st.charAt(0) - 'A']++;
            } else if (a[st.charAt(0) - 'A'] > 0) {
                ans.add(st.charAt(1));
                a[st.charAt(0) - 'A']--;
                a[st.charAt(1) - 'A']++;
            } else {
                w.println("No");
                return;
            }
            w.println("Yes");
            for (char c : ans) w.println(c);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

