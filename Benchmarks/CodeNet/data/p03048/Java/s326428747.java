import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; r * i <= n; i++) {
            for (int j = 0; g * j <= n - i; j++) {
                for (int j2 = 0; b * j2 <= n - j; j2++) {
                    int countR = r * i;
                    int countG = g * j;
                    int countB = b * j2;
                    int sum = countR + countG + countB;
                    if (sum == n) {
                        result++;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
