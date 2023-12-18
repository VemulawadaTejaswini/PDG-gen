import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int[] plist = new int[n];
        for (int i = 0; i < n; i++) {
            plist[i] = sc.nextInt();
        }

        // 処理
        int out = 0;
        for (int i = 0; i < n; i++) {
            boolean result = true;
            for (int j = 0; j <= i; j++) {
                if (plist[i] <= plist[j]) {
                    continue;
                } else {
                    result = false;
                    break;
                }
            }

            out += result == true ? 1 : 0;
        }

        // 出力
        System.out.println(out);
    }
}