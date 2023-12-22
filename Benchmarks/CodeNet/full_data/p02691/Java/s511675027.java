import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            final int hi = a[i];
            for (int j = i + 1; j < n; j++) {
                final int diff = j - i;
                final int h = hi + a[j];
                if (diff == h) {
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
