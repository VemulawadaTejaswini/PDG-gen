import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // 主処理
        long[] count = new long[5];
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith("M")) {
                count[0]++;
            } else if (s[i].startsWith("A")) {
                count[1]++;
            } else if (s[i].startsWith("R")) {
                count[2]++;
            } else if (s[i].startsWith("C")) {
                count[3]++;
            } else if (s[i].startsWith("H")) {
                count[4]++;
            }
        }

        long result = 1;
        int kind = 0;
        for (int i = 0; i < count.length; i++) {
            if (0 < count[i]) {
                result *= count[i];
                kind++;
            }
        }

        if (3 < kind) {
            result *= calcCombination(kind, 3);
            result--;
        } else if (kind < 3) {
            result = 0;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }

    public static long calcCombination(int n, int m) {
        if (n < m || m < 0) {
            throw new IllegalArgumentException("引数の値が不正です ( n : " + n + ", m : " + m + ")");
        }
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
