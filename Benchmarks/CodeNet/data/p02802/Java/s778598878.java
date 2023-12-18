import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[m];
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
            s[i] = sc.next();
        }

        // 主処理
        int[] count = new int[n];
        int[] acFlg = new int[n];
        for (int i = 0; i < m; i++) {
            int index = p[i] - 1;
            if ("AC".equals(s[i])) {
                acFlg[index] = 1;
            } else if (acFlg[index] != 1) {
                count[index] = 0 < count[index] ? count[index] + 1 : 1;
            }
        }

        String result = Arrays.stream(acFlg).sum() + " " + Arrays.stream(count).sum();

        // 出力
        System.out.println(result);
        sc.close();
    }
}