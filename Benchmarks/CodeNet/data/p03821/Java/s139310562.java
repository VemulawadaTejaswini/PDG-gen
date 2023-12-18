import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
            b[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        long increase = 0;
        for (int i = n - 1; 0 <= i; i--) {
            long numA = a[i] + increase;
            long numB = b[i];
            if (numA <= numB) {
                increase += numB - numA;
            } else {
                long num = (long) Math.ceil((double) numA / numB) * numB;
                increase += Math.max(0, num - numA);
            }
        }
        long result = increase;

        // 出力
        System.out.println(result);
    }
}
