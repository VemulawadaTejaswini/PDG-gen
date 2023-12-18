import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int countA = s.replaceAll("[^a]", "").length();
        int countB = s.replaceAll("[^b]", "").length();
        int countC = s.replaceAll("[^c]", "").length();

        int min = Math.min(Math.min(countA, countB), countC);
        boolean judge = isNearly(min, countA) && isNearly(min, countB) && isNearly(min, countC);
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }

    public static boolean isNearly(int n, int target) {
        return target == n || target == n + 1;
    }
}
