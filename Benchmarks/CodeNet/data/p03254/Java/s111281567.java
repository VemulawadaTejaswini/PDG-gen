import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int count = 0;

        int remain = x;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] <= remain) {
                remain -= a[i];
                count++;
            }
            if (i == n - 1 && remain != 0) {
                count--;
            }
        }

        int result = Math.max(0, count);

        // 出力
        System.out.println(result);
    }
}
