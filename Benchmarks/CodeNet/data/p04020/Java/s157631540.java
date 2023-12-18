import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        long result = 0;
        for (int i = 1; i < n; i++) {
            int left = a[i - 1];
            int right = a[i];
            if (left % 2 == 1 && right % 2 == 1) {
                if (left < right) {
                    a[i] = right - left;
                    a[i - 1] = 0;
                } else {
                    a[i] = 0;
                    a[i - 1] = left - right;
                }
                int min = Math.min(left, right);
                result += (long) min;
            }
        }
        for (int i = 1; i < n; i++) {
            int left = a[i - 1];
            int right = a[i];
            if (left < right) {
                a[i] = right - left;
                a[i - 1] = 0;
            } else {
                a[i] = 0;
                a[i - 1] = left - right;
            }
            int min = Math.min(left, right);
            result += (long) min;
        }
        result += Arrays.stream(a).map(i -> i / 2).mapToLong(i -> i).sum();

        // 出力
        System.out.println(result);
    }
}
