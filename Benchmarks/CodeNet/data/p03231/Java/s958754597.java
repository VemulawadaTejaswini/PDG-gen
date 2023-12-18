import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // 主処理
        int l = (int) lcm(n, m);
        int lpn = l / n;
        int lpm = l / m;

        boolean judge = true;
        String[] word = new String[l + 1];

        for (int i = 0; i < n; i++) {
            String w = String.valueOf(s.charAt(i));
            int index = (i * lpn) + 1;
            if (word[index] == null || w.equals(word[index])) {
                word[index] = w;
            } else {
                judge = false;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            String w = String.valueOf(t.charAt(i));
            int index = (i * lpm) + 1;
            if (word[index] == null || w.equals(word[index])) {
                word[index] = w;
            } else {
                judge = false;
                break;
            }
        }

        int result = judge ? l : -1;

        // 出力
        System.out.println(result);
    }

    public static long lcm(long a, long b) {
        long gcd = gcd(a, b);
        return a / gcd * b;
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}