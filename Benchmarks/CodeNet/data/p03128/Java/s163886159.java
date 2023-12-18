import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 文字列をDP
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 5);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 3);
        map.put(8, 7);
        map.put(9, 6);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] dp = new String[10002];
        Arrays.fill(dp, "");
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt();
            b[i] = map.get(a[i]);
        }
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (i - b[j] >= 0 && sumStringNumDigit(dp[i - b[j]], map) + b[j] == i) {
                    dp[i] = numStringCompare(dp[i - b[j]] + a[j], dp[i]);
                }
            }
        }
        System.out.println(dp[n]);
    }

    //桁数を比較し、同じであれば辞書順を比較する。
    static String numStringCompare (String a, String b) {
        if (a.length() != b.length()) {
            return a.length() > b.length() ? a : b;
        } else {
            return a.compareTo(b) > 0 ? a : b;
        }
    }
    //文字列で入ってきた数値の各桁の和を返す
    static int sumStringNumDigit (String a, Map<Integer, Integer> map) {
        int sum = 0;
        for (int i = 0 ; i < a.length(); i++) {
            sum += map.get(Integer.valueOf(a.substring(i, i + 1)));
        }
        return sum;
    }

}