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
        int result = 0;
        int sum = Arrays.stream(a).mapToInt(i -> i).sum();
        if (x < sum) {
            Arrays.sort(a);
            int num = 0;
            for (int i = 0; i < a.length; i++) {
                num += a[i];
                if (num <= x) {
                    result++;
                }
            }
        } else if (sum < x) {
            result = n - 1;
        } else {
            result = n;
        }

        // 出力
        System.out.println(result);
    }
}
