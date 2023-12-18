import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = t;
        for (int i = 0; i < array.length - 1; i++) {
            result += Math.min(t, array[i + 1] - array[i]);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
