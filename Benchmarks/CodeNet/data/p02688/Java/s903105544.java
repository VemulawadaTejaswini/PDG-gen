import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int[] flg = new int[n];

        for (int i = 0; i < k; i++) {
            int d = Integer.parseInt(sc.next());
            for (int j = 0; j < d; j++) {
                int a = Integer.parseInt(sc.next());
                flg[a - 1]++;
            }
        }
        sc.close();

        // 主処理
        int count = Arrays.stream(flg).filter(i -> i == 0).toArray().length;
        int result = count;

        // 出力
        System.out.println(result);
    }
}
