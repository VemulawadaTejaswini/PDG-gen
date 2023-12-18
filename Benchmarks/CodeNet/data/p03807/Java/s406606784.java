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
        int oddCount = 0;
        for (int num : a) {
            if (num % 2 == 1) {
                oddCount++;
            }
        }
        boolean judge = oddCount % 2 == 0;
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
