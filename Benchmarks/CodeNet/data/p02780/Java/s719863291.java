import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Integer[] p = new Integer[n];
        Arrays.setAll(p, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        double[] exp = new double[n];
        for (int i = 0; i < n; i++) {
            exp[i] = (double) sum(p[i]) / p[i];
        }
        double total = 0;
        for (int i = 0; i < k; i++) {
            total += exp[i];
        }
        double max = total;
        for (int i = 0; i < n - k; i++) {
            total -= exp[i];
            total += exp[i + k];
            max = Math.max(max, total);
        }
        double result = max;

        // 出力
        System.out.println(result);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = n; 0 < i; i--) {
            sum += i;
        }
        return sum;
    }
}
