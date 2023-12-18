import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        boolean judge = true;
        int start = Math.min(a, b) - 1;
        int target = Math.max(c, d) - 1;
        for (int i = start; i < target; i++) {
            if (a < b && d < c) {
                if (!canThrounghtOver(b - 1, s)) {
                    judge = false;
                    break;
                }
            } else if (b < a && c < d) {
                if (!canThrounghtOver(a - 1, s)) {
                    judge = false;
                    break;
                }
            }
            if (s.charAt(i) == '#' && s.charAt(i + 1) == '#') {
                judge = false;
                break;
            }
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }

    public static boolean canThrounghtOver(int n, String s) {
        boolean canLeft = 0 <= n - 2 && s.charAt(n - 2) == '.' && s.charAt(n - 1) == '.';
        boolean canRight = n + 2 < s.length() && s.charAt(n + 1) == '.' && s.charAt(n + 2) == '.';
        boolean canBoth = 0 < n - 1 && s.charAt(n - 1) == '.' && n + 1 < s.length() && s.charAt(n + 1) == '.';
        return canLeft || canRight || canBoth;
    }
}
