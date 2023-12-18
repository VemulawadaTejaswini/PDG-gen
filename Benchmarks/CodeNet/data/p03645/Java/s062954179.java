import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[m];
        int[] b = new int[m];
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            if (a[i] == 1) {
                numList.add(b[i]);
            }
        }

        // 主処理
        boolean judge = false;
        for (int i = 0; i < m; i++) {
            if (numList.contains(a[i]) && b[i] == n) {
                judge = true;
                break;
            }
        }

        String result = judge ? "POSSIBLE" : "IMPOSSIBLE";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
