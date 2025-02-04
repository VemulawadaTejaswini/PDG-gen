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
        for (int i = 0; i < n; i += 2) {
            if (a[i] % 2 == 1) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
