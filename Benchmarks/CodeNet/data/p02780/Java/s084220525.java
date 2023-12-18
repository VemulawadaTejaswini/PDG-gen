import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        // 処理
        int now = 0;
        int mark = 0;
        // 最初
        for (int i = 0; i < k; i++) {
            now += p[i];
        }
        int max = now;
        // ループ
        for (int i = k; i < n; i++) {
            now = now - p[i - k] + p[i];
            if (max < now) {
                max = now;
                mark = i - k + 1;
            }
        }
        // 期待値
        float out = 0;
        for (int i = mark; i < mark + k; i++) {
            out += Main.exp(p[i]);
        }

        // 出力
        System.out.println(out);
        sc.close();
    }

    public static float exp(int in) {
        float sum = 0;
        for (int i = 1; i <= in; i++) {
            sum += i;
        }
        return sum / in;
    }
}