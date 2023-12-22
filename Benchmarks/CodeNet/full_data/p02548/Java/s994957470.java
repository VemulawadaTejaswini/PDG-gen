
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if ((i * j) + k == n) {
                        count++;
                    }
                }
            }
        }

        // 出力
        System.out.println(count);
    }
}
