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
        int count2 = Math.max(0, Arrays.stream(a).filter(i -> i == 2).toArray().length - 1);
        int count4 = Arrays.stream(a).filter(i -> i % 4 == 0).toArray().length;
        boolean judge = (n - count2) / 2 <= count4;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
