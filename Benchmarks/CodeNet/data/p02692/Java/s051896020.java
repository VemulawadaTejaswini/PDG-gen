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
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FThreeVariablesGame solver = new FThreeVariablesGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class FThreeVariablesGame {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
            boolean valid = true;
            ArrayList<Character> res = new ArrayList<>();
            String[] f = new String[n];
            for (int i = 0; i < n; i++)
                f[i] = s.next();
            for (int i = 0; i < n; i++) {
                //w.println(a + " " + b + " " + c);
                if (f[i].equals("AB")) {
                    if (a - 1 >= 1) {
                        a--;
                        b++;
                        res.add('B');
                    } else if (b - 1 >= 1) {
                        a++;
                        b--;
                        res.add('A');
                    } else {
                        if (a == 1 && b == 1) {
                            if (i + 1 < n && f[i + 1].equals("AC")) {
                                a++;
                                b--;
                                res.add('A');
                            } else {
                                a--;
                                b++;
                                res.add('B');
                            }
                        } else {
                            if (a > 0) {
                                a--;
                                b++;
                                res.add('B');
                            } else {
                                a++;
                                b--;
                                res.add('A');
                            }
                        }
                        if (a < 0 || b < 0 || c < 0) {
                            valid = false;
                            break;
                        }
                    }
                } else if (f[i].equals("BC")) {
                    if (b - 1 >= 1) {
                        b--;
                        c++;
                        res.add('C');
                    } else if (c - 1 >= 1) {
                        c--;
                        b++;
                        res.add('B');
                    } else {
                        if (b == 1 && c == 1) {
                            if (i + 1 < n && f[i + 1].equals("AB")) {
                                b++;
                                c--;
                                res.add('B');
                            } else {
                                c++;
                                b--;
                                res.add('C');
                            }
                        } else {
                            if (b > 0) {
                                b--;
                                c++;
                                res.add('C');
                            } else {
                                b++;
                                c--;
                                res.add('B');
                            }
                        }
                        if (a < 0 || b < 0 || c < 0) {
                            valid = false;
                            break;
                        }
                    }
                } else if (f[i].equals("AC")) {
                    if (c - 1 >= 1) {
                        c--;
                        a++;
                        res.add('A');
                    } else if (a - 1 >= 1) {
                        a--;
                        c++;
                        res.add('C');
                    } else {
                        if (a == 1 && c == 1) {
                            if (i + 1 < n && f[i + 1].equals("BC")) {
                                a--;
                                c++;
                                res.add('C');
                            } else {
                                a++;
                                c--;
                                res.add('A');
                            }
                        } else {
                            if (a > 0) {
                                a--;
                                c++;
                                res.add('C');
                            } else {
                                a++;
                                c--;
                                res.add('A');
                            }
                        }
                        if (a < 0 || b < 0 || c < 0) {
                            valid = false;
                            break;
                        }
                    }
                }
            }
            //w.println(a + " " + b + " " + c);
            if (valid) {
                w.println("Yes");
                for (char i : res)
                    w.println(i);
            } else
                w.println("No");
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

