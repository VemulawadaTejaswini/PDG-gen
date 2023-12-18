import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Random;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] need = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
            int n = need[0] + need[1] + need[2];
            int[][] a = new int[3][n];
            int[] usedIn = new int[n];

            int[] have = new int[3];
            long ans = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 3; ++j) {
                    a[j][i] = in.nextInt();
                }
                int pos = 0;
                for (int j = 1; j < 3; ++j) {
                    if (a[j][i] > a[pos][i]) {
                        pos = j;
                    }
                }
                have[pos]++;
                usedIn[i] = pos;
                ans += a[pos][i];
            }

            int[] bigger = new int[2];
            int bpos = 0;
            int[] smaller = new int[2];
            smaller[0] = smaller[1] = -1;
            int spos = 0;
            for (int i = 0; i < 3; ++i) {
                if (have[i] > need[i]) {
                    bigger[bpos++] = i;
                } else if (have[i] < need[i]) {
                    smaller[spos++] = i;
                }
            }
            if (spos == 1) {
                ans += solveSmaller(a, usedIn, have, need);
            } else if (spos == 2) {
                int bg = bigger[0];
                IntPair[] add1 = new IntPair[n];
                IntPair[] add2 = new IntPair[n];
                int pos1 = 0, pos2 = 0;
                int[] win1 = new int[n];
                int[] win2 = new int[n];
                for (int i = 0; i < n; ++i) {
                    if (usedIn[i] == bg) {
                        for (int j = 0; j < 3; ++j) {
                            if (j == smaller[0]) {
                                add1[pos1++] = new IntPair(a[j][i] - a[bg][i], i);
                                win1[i] = a[j][i] - a[bg][i];
                            } else if (j == smaller[1]) {
                                add2[pos2++] = new IntPair(a[j][i] - a[bg][i], i);
                                win2[i] = a[j][i] - a[bg][i];
                            }
                        }
                    }
                }
                int put1 = need[smaller[0]] - have[smaller[0]];
                int put2 = smaller[1] == -1 ? 0 : need[smaller[1]] - have[smaller[1]];
                Arrays.sort(add1, 0, pos1);
                ArraysUtils.reverse(add1, 0, pos1);
                Arrays.sort(add2, 0, pos2);
                ArraysUtils.reverse(add2, 0, pos1);
                boolean[] used1 = new boolean[n], used2 = new boolean[n];
                int onFirst = 0, onSecond = 0;
                int xp1 = 0, xp2 = 0;
                while (onFirst < put1 || onSecond < put2) {
                    while (used1[add1[xp1].second] || used2[add1[xp1].second]) {
                        xp1++;
                    }
                    while (used1[add2[xp2].second] || used2[add2[xp2].second]) {
                        xp2++;
                    }
                    if (onFirst < put1 && (onSecond == put2 || add1[xp1].first >= win2[add1[xp1].second])) {
                        used1[add1[xp1++].second] = true;
                        onFirst++;
                    } else {
                        used2[add2[xp2++].second] = true;
                        onSecond++;
                    }
                }
                for (int i = 0; i < n; ++i) {
                    if (used1[i] && !used2[i]) {
                        ans += a[smaller[0]][i] - a[bg][i];
                        have[smaller[0]]++;
                        usedIn[i] = smaller[0];
                    } else if (!used1[i] && used2[i]) {
                        ans += a[smaller[1]][i] - a[bg][i];
                        have[smaller[1]]++;
                        usedIn[i] = smaller[1];
                    } else if (used1[i] && used2[i]) {
                        if (a[smaller[0]][i] > a[smaller[1]][i]) {
                            ans += a[smaller[0]][i] - a[bg][i];
                            have[smaller[0]]++;
                            usedIn[i] = smaller[0];
                        } else {
                            ans += a[smaller[1]][i] - a[bg][i];
                            have[smaller[1]]++;
                            usedIn[1] = smaller[1];
                        }
                    }
                }
                ans += solveSmaller(a, usedIn, have, need);
            }
            out.println(ans);
        }

        private long solveSmaller(int[][] a, int[] usedIn, int[] have, int[] need) {
            int n = a[0].length;
            int[] bigger = new int[2];
            int bpos = 0;
            int[] smaller = new int[2];
            smaller[0] = smaller[1] = -1;
            int spos = 0;
            for (int i = 0; i < 3; ++i) {
                if (have[i] > need[i]) {
                    bigger[bpos++] = i;
                } else if (have[i] < need[i]) {
                    smaller[spos++] = i;
                }
            }
            if (spos == 1) {
                int sm = smaller[0];
                long[][] values = new long[3][n];
                int[] k = new int[3];
                for (int i = 0; i < n; ++i) {
                    if (usedIn[i] != sm) {
                        values[usedIn[i]][k[usedIn[i]]++] = a[sm][i] - a[usedIn[i]][i];
                    }
                }
                for (int j = 0; j < 3; ++j) {
                    if (j != sm) {
                        ArraysUtils.sort(values[j], 0, k[j]);
                        ArraysUtils.reverse(values[j], 0, k[j]);
                        k[j] = have[j] - need[j];
                    }
                }
                int[] inds = new int[3];
                int diff = need[sm] - have[sm];
                long ans = 0;
                while (inds[0] + inds[1] + inds[2] < diff) {
                    long max = Long.MIN_VALUE;
                    int pos = -1;
                    for (int j = 0; j < 3; ++j) {
                        if (inds[j] < k[j] && values[j][inds[j]] > max) {
                            max = values[j][inds[j]];
                            pos = j;
                        }
                    }
                    ans += max;
                    inds[pos]++;
                }
                return ans;
            } else if (spos == 0) {
                return 0;
            } else {
                throw new RuntimeException();
            }
        }

    }

    static class ArraysUtils {
        public static void randomShuffle(long[] a, int from, int to) {
            Random rnd = new Random();
            for (int i = from; i < to; ++i) {
                int pos = i + rnd.nextInt(to - i);
                swap(a, i, pos);
            }
        }

        public static void sort(long[] a, int from, int to) {
            randomShuffle(a, from, to);
            Arrays.sort(a, from, to);
        }

        public static void swap(long[] a, int i, int j) {
            long aux = a[i];
            a[i] = a[j];
            a[j] = aux;
        }

        public static void swap(Object[] a, int i, int j) {
            Object aux = a[i];
            a[i] = a[j];
            a[j] = aux;
        }

        public static void reverse(long[] a, int left, int right) {
            while (left < right - 1)
                swap(a, left++, --right);
        }

        public static void reverse(Object[] a, int left, int right) {
            while (left < right - 1)
                swap(a, left++, --right);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class IntPair implements Comparable<IntPair> {
        public int first;
        public int second;

        public IntPair() {
        }

        public IntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(IntPair other) {
            if (first != other.first) return first < other.first ? -1 : 1;
            if (second != other.second) return second < other.second ? -1 : 1;
            return 0;
        }

        public boolean equals(Object other) {
            if (!(other instanceof IntPair)) return false;
            return compareTo((IntPair) other) == 0;
        }

        public int hashCode() {
            return first * 31 + second;
        }

    }
}

