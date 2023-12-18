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
        int count2 = Arrays.stream(a).filter(i -> i == 2).mapToInt(i -> i).toArray().length / 2;
        int count4 = Arrays.stream(a).filter(i -> i % 4 == 0).mapToInt(i -> i).toArray().length;
        boolean judge = n / 2 <= (count2 + count4);
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
