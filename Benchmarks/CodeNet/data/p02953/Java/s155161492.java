import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        Arrays.setAll(h, i -> Integer.parseInt(sc.next()));

        // 主処理
        h[0]--;
        for (int i = 1; i < h.length; i++) {
            if (h[i - 1] < h[i]) {
                h[i]--;
            }
        }
        boolean judge = true;
        for (int i = 1; i < h.length; i++) {
            if (h[i - 1] > h[i]) {
                judge = false;
                break;
            }
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
