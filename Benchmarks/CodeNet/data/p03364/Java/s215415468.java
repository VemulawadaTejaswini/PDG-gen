import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.Solve(in, out);
        out.close();
    }


    static class TaskC {
        class Point {
            int x;
            int y;

            Point(int xx, int yy) {
                x = xx;
                y = yy;
            }
        }

        int[] charCount = new int[26];
        int maxCount = 0;

        void Solve(InputReader in, PrintWriter out) {
            int n = in.NextInt();
            char[][] image = new char[n][];
            Point[] ps = new Point[26];
            for (int i = 0; i < 26; i++) ps[i] = new Point(0, 0);
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                image[i] = in.Next().toCharArray();
                for (int j = 0; j < n; j++) {
                    char c = image[i][j];
                    charCount[c - 'a']++;
                    maxCount = Math.max((charCount[c - 'a']), maxCount);
                    ps[c - 'a'].x = i;
                    ps[c - 'a'].y = j;
                    minIndex = c - 'a';
                }
            }
            if (n * n == maxCount) {
                out.println(n * n);
                return;
            }
            for (int i = 0; i < 26; i++) {
                if (charCount[minIndex] > charCount[i]) {
                    minIndex = i;
                }
            }

            ArrayList<Point> possibilities = new ArrayList<>();
            {
                Point p = ps[minIndex];
                for (int A = 0; A < n; A++) {
                    for (int B = 0; B < n; B++) {
                        if (image[p.x][p.y] == image[(p.y + B - A + n) % n][(p.x + A - B + n) % n]) {
                            possibilities.add(new Point(A, B));
                        }
                    }
                }
            }
            long res = 0;
            LOOP:
            for (Point p : possibilities) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (image[(i - p.x + n) % n][(j - p.y + n) % n] != image[(j - p.x + n) % n][(i - p.y + n) % n]) {
                            continue LOOP;
                        }
                    }
                }
                res++;
            }
            out.println(res);
        }
    }

    static int GetMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        for (int a : ar) {
            max = Math.max(max, a);
        }
        return max;
    }

    static int GetMin(int[] ar) {
        int min = Integer.MAX_VALUE;
        for (int a : ar) {
            min = Math.min(min, a);
        }
        return min;
    }

    static long GetSum(int[] ar) {
        long s = 0;
        for (int a : ar) s += a;
        return s;
    }

    static int[] GetCount(int[] ar) {
        return GetCount(ar, GetMax(ar));
    }

    static int[] GetCount(int[] ar, int maxValue) {
        int[] dp = new int[maxValue + 1];
        for (int a : ar) {
            dp[a]++;
        }
        return dp;
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String Next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int NextInt() {
            return Integer.parseInt(Next());
        }

        long NextLong() {
            return Long.parseLong(Next());
        }

        double NextDouble() {
            return Double.parseDouble(Next());
        }

        int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() - offset;
            }
            return a;
        }

        int[][] NextIntMatrix(int n, int m) {
            return NextIntMatrix(n, m, 0);
        }

        int[][] NextIntMatrix(int n, int m, int offset) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextInt() - offset;
                }
            }
            return a;
        }


        public long[] NextLongArray(int n) {
            return NextLongArray(n, 0);
        }

        long[] NextLongArray(int n, int offset) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextLong() - offset;
            }
            return a;
        }

        long[][] NextLongMatrix(int n, int m) {
            return NextLongMatrix(n, m, 0);
        }

        long[][] NextLongMatrix(int n, int m, int offset) {
            long[][] a = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextLong() - offset;
                }
            }
            return a;
        }
    }
}