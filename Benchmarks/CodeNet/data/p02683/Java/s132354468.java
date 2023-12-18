import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static String Y = "Yes";
    public static String N = "No";
    public static String I = "IMPOSSIBLE";
    public static String B = "Bad";
    public static String G = "Good";
    public static long MOD = (long) (Math.pow(10, 9) + 7);
    public static Scanner sc = new Scanner(System.in);

    static int n;
    static int m;
    static int x;
    static int loopCount = 0;
    static int[][] a;
    static int[] c;
    static int sum_c = 0;
    static int[] sum_c_save;
    static int[] understand;

    public static void main(String[] args) {

        // 参考書数
        n = ni();

        // アルゴリズム数
        m = ni();

        // 目標理解度
        x = ni();

        // 参考書値段
        c = new int[n + 1];

        // 参考書アルゴリズム上昇理解度
        a = new int[n + 1][m];

        // 値段が付いた（買う可能性のあるものリスト）
        ArrayList<Integer> c_list = new ArrayList<>();

        sum_c_save = new int[5000];

        for (int i = 0; i < 5000; i++) {
            sum_c_save[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            c[i] = ni();
            for (int j = 0; j < m; j++) {
                a[i][j] = ni();
            }
        }

        understand = new int[m];

        dfs(0, true);

        sum_c -= c[0];
        for (int h = 0; h < m; h++) {
            understand[h] -= a[0][h];
        }

        dfs(0, false);

        int min_c = Integer.MAX_VALUE;

        for (int i = 0; i < loopCount; i++) {
            if (min_c >= sum_c_save[i]) {
                min_c = sum_c_save[i];

            }
            //out("min_c:" + min_c + " loopCount:" + i);
        }

        if (!(min_c == Integer.MAX_VALUE)) {
            out(min_c);
        } else {
            out(-1);
        }

    }

    static void dfs(int i, boolean takeIt) {

        //out("---------------dfs" + i + "回目---------------------");

        if (takeIt) {
            // 参考書の理解度を足し算
            for (int h = 0; h < m; h++) {
                understand[h] += a[i][h];
            }

            // 値段を足し算
            sum_c += c[i];

        }

        if (i >= n - 1) {

            int sum_c_tmp = sum_c;

            for (int g = 0; g < m; g++) {
                // out(g + ":" + understand[g]);
                if (understand[g] < x) {
                    sum_c_tmp = Integer.MAX_VALUE;
                    break;
                }
            }
            sum_c_save[loopCount++] = sum_c_tmp;

            //out("sum_c:" + sum_c);

            return;
        }

        dfs(i + 1, true);

        sum_c -= c[i + 1];
        for (int h = 0; h < m; h++) {
            understand[h] -= a[i + 1][h];
        }

        dfs(i + 1, false);

    }

    /*
     * 以下メソッド集
     */
    static int ni() {

        return sc.nextInt();
    }

    static long nl() {

        return sc.nextLong();
    }

    static String n() {

        return sc.next();
    }

    static char[] nc() {

        return sc.next().toCharArray();
    }

    static int kaijo(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * kaijo(n - 1);
        }
    }

    static int fib(int n) {

        return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
    }

    static long lcm(long m, long n) {

        return m * n / gcd(m, n);
    }

    static int lcm(int m, int n) {

        return m * n / gcd(m, n);
    }

    static long gcd(long a, long b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static int gcd(int a, int b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static void out(String info) {

        System.out.println(info);
    }

    static void out(int info) {

        System.out.println(info);
    }

    static void out(double info) {

        System.out.println(info);
    }

    static void out(long info) {

        System.out.println(info);
    }

    static void out(char info) {

        System.out.println(info);
    }

    static void outn(String info) {

        System.out.print(info);
    }

    static void outn(int info) {

        System.out.print(info);
    }

    static void outn(double info) {

        System.out.print(info);
    }

    static void outn(long info) {

        System.out.print(info);
    }

    static void outn(char info) {

        System.out.print(info);
    }

    static int max(int a, int b) {

        return Math.max(a, b);
    }

    static long max(long a, long b) {

        return Math.max(a, b);
    }

    static int min(int a, int b) {

        return Math.min(a, b);
    }

    static long min(long a, long b) {

        return Math.min(a, b);
    }
}
