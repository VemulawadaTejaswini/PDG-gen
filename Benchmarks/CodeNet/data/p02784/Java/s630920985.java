import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int sum = Arrays.stream(a).sum();
        String result = h <= sum ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
