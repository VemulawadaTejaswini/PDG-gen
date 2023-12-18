import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        // 主処理
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(i * m);
            for (int j = 1; j <= m; j++) {
                set.add(j * n);
                set.add((n * i - (i * j)) + (m * j - (i * j)));
            }
        }

        String result = k == 0 || set.contains(k) ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
