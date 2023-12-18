import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        Arrays.setAll(a, i -> Long.parseLong(sc.next()));
        sc.close();

        // 主処理
        long left = 0;
        long right = 0;
        int leftIndex = 0;
        int rightIndex = n - 1;
        for (int i = 0; i < n; i++) {
            if (left <= right) {
                left += a[leftIndex];
                leftIndex++;
            } else {
                right += a[rightIndex];
                rightIndex--;
            }
        }
        long result = Math.abs(left - right);

        // 出力
        System.out.println(result);
    }
}
