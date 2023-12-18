import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] t = new Long[n];
        Arrays.setAll(t, i -> Long.parseLong(sc.next()));
        sc.close();

        // 主処理
        long result = t[0].longValue();
        for (int i = 1; i < n; i++) {
            result = lcm(result, t[i]);
        }

        // 出力
        System.out.println(result);
    }

    public static long lcm(long a, long b) {
        if (a % b == 0 || b % a == 0) {
            return Math.max(a, b);
        }
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return c / b;
    }
}
