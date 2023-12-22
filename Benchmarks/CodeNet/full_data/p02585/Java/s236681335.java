import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Integer[] p = new Integer[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            c[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        long[] point = new long[n];
        for (int i = 0; i < n; i++) {
            point[i] = c[p[i] - 1];
        }

        long[] sumPoint = new long[n];
        int mod = k % 5000;
        for (int i = 0; i < n; i++) {
            int index = p[i] - 1;
            long sum = 0;
            sumPoint[i] = c[index];
            for (int j = 0; j < mod; j++) {
                sum += c[index];
                sumPoint[i] = Math.max(sum, sumPoint[i]);
                index = p[index] - 1;
            }
        }

        long sum = Arrays.stream(point).sum();

        long result = 0;
        long max = Arrays.stream(sumPoint).max().orElse(0);
        if (5000 < k && 0 < sum) {
            long count = k / 5000;
            result = sum * count + max;
        } else {
            result = max;
        }

        // 出力
        System.out.println(result);
    }
}
