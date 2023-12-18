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
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            int d = Math.abs(a[i] - x);
            diff[i] = d;
        }
        int min = Arrays.stream(diff).min().getAsInt();
        int result = min;

        // 出力
        System.out.println(result);
    }
}
