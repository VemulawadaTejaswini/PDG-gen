import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long d = Integer.parseInt(sc.next());
        d *= d;
        Long[] x = new Long[n];
        Long[] y = new Long[n];
        for (int i = 0; i < n; i++) {
            x[i] = Long.parseLong(sc.next());
            y[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            long dist = x[i] * x[i] + y[i] * y[i];
            if (dist <= d) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
