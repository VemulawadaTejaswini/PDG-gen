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
        int sum = Arrays.stream(a).mapToInt(i -> i).sum();

        int result = 0;
        if (x == sum) {
            result = n;

        } else if (sum < x) {
            result = n - 1;

        } else {
            Arrays.sort(a);
            int total = 0;
            for (int i = 0; i < a.length; i++) {
                total += a[i];
                if (x < total) {
                    result = i;
                    break;
                }
            }

        }

        // 出力
        System.out.println(result);
    }
}
