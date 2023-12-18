import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int sum = Arrays.stream(a).mapToInt(i -> i).sum();

        Arrays.sort(a, Collections.reverseOrder());
        double target = a[m - 1];

        boolean judge = (double) sum / (4.0 * m) < target;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
