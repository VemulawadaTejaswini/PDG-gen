import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n * 3];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Arrays.sort(a);
        long result = 0;
        for (int i = n; i < 2 * n; i++) {
            result += a[i];
        }

        // 出力
        System.out.println(result);
    }
}
