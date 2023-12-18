import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // 主処理
        int result = 2 * n;
        for (int i = 0; i < n; i++) {
            String foot = t.substring(0, n - i);
            if (s.endsWith(foot)) {
                result -= foot.length();
                break;
            }
        }

        // 出力
        System.out.println(result);
    }
}
