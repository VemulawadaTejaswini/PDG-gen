import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FThreeVariablesGame solver = new FThreeVariablesGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class FThreeVariablesGame {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();

            long[] val = new long[]{in.readInt(), in.readInt(), in.readInt()};


            long sum = (long) val[0] + (long) val[1] + (long) val[2];

            String[] vals = in.readStringArray(n);


            int[] nextAB = new int[n + 1];
            int[] nextAC = new int[n + 1];
            int[] nextBC = new int[n + 1];

            String[] pairs = new String[]{"AB", "AC", "BC"};
            int[][] nextPairs = new int[][]{
                    nextAB,
                    nextAC,
                    nextBC
            };

            nextAB[n] = nextAC[n] = nextBC[n] = -1;

            for (int i = n - 1; i >= 0; i--) {
                nextAB[i] = nextAB[i + 1];
                nextAC[i] = nextAC[i + 1];
                nextBC[i] = nextBC[i + 1];

                switch (vals[i]) {
                    case "AB":
                        nextAB[i] = i;
                        break;

                    case "AC":
                        nextAC[i] = i;
                        break;

                    case "BC":
                        nextBC[i] = i;
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                String s = vals[i];

                int curPair = -1;
                int id1 = -1;
                int id2 = -1;
                int id3 = -1;
                switch (vals[i]) {
                    case "AB":
                        curPair = 0;
                        id1 = 0;
                        id2 = 1;
                        id3 = 2;
                        break;

                    case "AC":
                        curPair = 1;
                        id1 = 0;
                        id2 = 2;
                        id3 = 1;
                        break;

                    case "BC":
                        curPair = 2;
                        id1 = 1;
                        id2 = 2;
                        id3 = 0;
                        break;
                }


                if (sum <= 2) {

                    if (val[id1] == 1 && val[id2] == 1) {
                        int nextUsageDiff1 = nextPairs[(curPair + 1) % 3][i];
                        int nextUsageDiff2 = nextPairs[(curPair + 2) % 3][i];

                        int nextUsageDiff = -1;
                        int nextPairDiff = -1;

                        if (nextUsageDiff1 == -1 && nextUsageDiff2 == -1) {
                            if (val[id1] > val[id2]) {
                                sb.append(s.charAt(1));
                                val[id2]++;
                                val[id1]--;
                            } else {
                                sb.append(s.charAt(0));
                                val[id2]--;
                                val[id1]++;
                            }
                        } else {
                            if (nextUsageDiff1 == -1) {
                                nextUsageDiff = nextUsageDiff2;
                                nextPairDiff = (curPair + 2) % 3;
                            } else if (nextUsageDiff2 == -1) {
                                nextUsageDiff = nextUsageDiff1;
                                nextPairDiff = (curPair + 1) % 3;
                            } else {
                                if (nextUsageDiff1 < nextUsageDiff2) {
                                    nextUsageDiff = nextUsageDiff1;
                                    nextPairDiff = (curPair + 1) % 3;
                                } else {
                                    nextUsageDiff = nextUsageDiff2;
                                    nextPairDiff = (curPair + 2) % 3;
                                }
                            }

                            int sameId = getSame(pairs[curPair], pairs[nextPairDiff]);
                            int elseId = id1 == sameId ? id2 : id1;
                            if ((nextUsageDiff % 2) == 1) {
                                // same
                                sb.append("ABC".charAt(sameId));
                                val[sameId]++;
                                val[elseId]--;
                            } else {
                                // diff
                                sb.append("ABC".charAt(elseId));
                                val[sameId]--;
                                val[elseId]++;
                            }
                        }
                    } else {
                        if (val[id1] > val[id2]) {
                            sb.append(s.charAt(1));
                            val[id2]++;
                            val[id1]--;
                        } else {
                            sb.append(s.charAt(0));
                            val[id2]--;
                            val[id1]++;
                        }
                    }
                } else {
                    if (val[id1] > val[id2]) {
                        sb.append(s.charAt(1));
                        val[id2]++;
                        val[id1]--;
                    } else {
                        sb.append(s.charAt(0));
                        val[id2]--;
                        val[id1]++;
                    }
                }

                if (val[0] < 0 || val[1] < 0 || val[2] < 0) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
            var res = sb.toString();
            for (int i = 0; i < res.length(); i++) {
                out.println(res.charAt(i));
            }

        }

        int getSame(String a, String b) {
            if (a.indexOf('A') != -1 && b.indexOf('A') != -1) {
                return 0;
            }
            if (a.indexOf('B') != -1 && b.indexOf('B') != -1) {
                return 1;
            }
            if (a.indexOf('C') != -1 && b.indexOf('C') != -1) {
                return 2;
            }
            return -1;
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String[] readStringArray(int size) {
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = readString();
            }
            return array;
        }

        private int read() {
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

        public int readInt() {
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

        public String readString() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void println(char i) {
            writer.println(i);
        }

        public void close() {
            writer.close();
        }

    }
}

