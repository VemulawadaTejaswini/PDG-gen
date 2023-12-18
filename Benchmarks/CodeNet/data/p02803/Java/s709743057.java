import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static char[][] s;
    static int[] dx = { -1, 0, 0, 1 };
    static int[] dy = { 0, -1, 1, 0 };
    static int h;
    static int w;
    static int INITIAL = -777;

    static void solve() {

        Queue<List<Integer>> q = new LinkedList<>();

        h = nextInt();
        w = nextInt();

        s = nextCharArray(h, w);

        int ans = Integer.MIN_VALUE;
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < w; y++) {
                int[][] num = new int[h][w];
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        num[i][j] = INITIAL;
                        if (s[i][j] == '#')
                            num[i][j] = Integer.MIN_VALUE;
                    }
                }
                if (s[x][y] != '#') {
                    num[x][y] = 0; // 訪問済み
                    q.add(Arrays.asList(x, y));
                }
                while (q.size() > 0) {
                    List<Integer> list = q.remove();
                    int xx = list.get(0);
                    int yy = list.get(1);
                    for (int i = 0; i < dx.length; i++) {
                        int nx = xx + dx[i];
                        int ny = yy + dy[i];
                        if (nx < 0 || h <= nx || ny < 0 || w <= ny || s[nx][ny] == '#')
                            continue;

                        if (num[nx][ny] == INITIAL) {
//                            System.out.println("nx=" + nx + ", ny=" + ny + ", num=" + num[nx][ny]);
                            num[nx][ny] = num[xx][yy] + 1;
//                            System.out.println(">>nx=" + nx + ", ny=" + ny + ", num=" + num[nx][ny]);
                            q.add(Arrays.asList(nx, ny));
                        }
                    }

                }

                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (num[i][j] > ans) {
                            ans = num[i][j];
                        }
                    }
                }
//                System.out.println(x + ":" + y + ":" + ans); // DEBUG
            }
        }

        out.println(ans);
    }

    static PrintWriter out;
    static Scanner sc;

    static int[][] newIntArray(int h, int w, int value) {
        int[][] ret = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ret[i][j] = value;
            }
        }
        return ret;
    }

    static int nextInt() {
        return Integer.parseInt(sc.next());
    }

    static long nextLong() {
        return Long.parseLong(sc.next());
    }

    static String nextString() {
        return sc.next();
    }

    static int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static List<Integer> nextIntList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextInt());
        }
        return list;
    }

    static List<Double> nextDoubleList(int n) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((double) nextInt());
        }
        return list;
    }

    static List<Long> nextLongList(int n) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextLong());
        }
        return list;
    }

    static char[][] nextCharArray(int h, int w) {
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = nextString();
            for (int j = 0; j < w; j++) {
                c[i][j] = str.charAt(j);
            }
        }
        return c;
    }

    static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    // greatest common divisor
    // 最大公約数
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // least common multiple
    // 最小公倍数
    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    // baseのn乗を計算を返す
    static int pow(int base, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }

    // return n^k mod m
    static long powMod(long n, long k, long m) {
        if (k == 0) {
            return 1;
        } else if (k % 2 == 1) {
            return powMod(n, k - 1, m) * n % m;
        } else {
            long tmp = powMod(n, k / 2, m);
            return tmp * tmp % m;
        }
    }

    // intをlength桁のbit文字列に変換
    static String toBitString(int length, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            if ((n >> i) % 2 == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }

//    // intをlength桁のbit文字列に変換
//    static String toBinaryString(int input, int length) {
//        return toBinaryString(input).substring(29 - length);
//    }
//
//    // intを29桁のbit文字列に変換
//    static String toBinaryString(int input) {
//        String ret = "";
//        int max = 0x10000000;
//        for (int i = 0; i < 29; i++) {
//            int tmp = input / max;
//            ret += tmp;
//            input %= max;
//            max /= 2;
//        }
//        return ret;
//    }

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
    }

}
