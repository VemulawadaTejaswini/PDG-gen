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
            for (int j = i + 1; j < n; j++) {
                int h = a[i] + a[j];
                int diff = Math.abs((i + 1) - (j + 1));
                if (h == diff) {
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
