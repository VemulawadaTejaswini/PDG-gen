import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n + 1];
        Integer[] b = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(b, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        long sum = Arrays.stream(a).mapToInt(i -> i).sum();
        for (int i = 0; i < n; i++) {
            int remain = Math.max(0, b[i] - a[i]);
            a[i] = Math.max(0, a[i] - b[i]);
            a[i + 1] = Math.max(0, a[i + 1] - remain);
        }
        long sumAfter = Arrays.stream(a).mapToInt(i -> i).sum();
        long result = sum - sumAfter;

        // 出力
        System.out.println(result);
    }
}
