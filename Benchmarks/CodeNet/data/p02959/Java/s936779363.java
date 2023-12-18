import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n + 1];
        Long[] b = new Long[n];
        Arrays.setAll(a, i -> Long.parseLong(sc.next()));
        Arrays.setAll(b, i -> Long.parseLong(sc.next()));
        sc.close();

        // 主処理
        long sum = Arrays.stream(a).mapToLong(i -> i).sum();
        for (int i = 0; i < n; i++) {
            long remain = Math.max(0, b[i] - a[i]);
            a[i] = Math.max(0, a[i] - b[i]);
            a[i + 1] = Math.max(0, a[i + 1] - remain);
        }
        long sumAfter = Arrays.stream(a).mapToLong(i -> i).sum();
        long result = sum - sumAfter;

        // 出力
        System.out.println(result);
    }
}
