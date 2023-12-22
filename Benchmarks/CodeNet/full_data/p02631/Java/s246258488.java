import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum ^= a[i];
        }
        sc.close();

        // 主処理
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            int num = sum ^ a[i];
            ans[i] = Integer.toString(num);
        }
        String result = String.join(" ", ans);

        // 出力
        System.out.println(result);
    }
}