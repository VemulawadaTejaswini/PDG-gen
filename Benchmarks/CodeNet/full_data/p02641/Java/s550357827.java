import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        int min = 1;
        for (int i = x; 0 <= i; i--) {
            if (!list.contains(i)) {
                min = i;
                break;
            }
        }
        int max = 100;
        for (int i = x; i <= 101; i++) {
            if (!list.contains(i)) {
                max = i;
                break;
            }
        }
        int minDiff = x - min;
        int maxDiff = max - x;
        boolean judge = minDiff <= maxDiff;
        int result = judge ? min : max;

        // 出力
        System.out.println(result);
    }
}
