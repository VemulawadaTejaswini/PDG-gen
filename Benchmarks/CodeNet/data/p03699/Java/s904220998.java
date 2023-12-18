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
        int sum = Arrays.stream(a).mapToInt(i -> i).sum();
        if (sum % 10 == 0) {
            int min = Arrays.stream(a).filter(i -> i % 10 != 0).mapToInt(i -> i).min().orElse(0);
            sum -= min;
        }
        int result = sum % 10 == 0 ? 0 : sum;

        // 出力
        System.out.println(result);
    }
}
