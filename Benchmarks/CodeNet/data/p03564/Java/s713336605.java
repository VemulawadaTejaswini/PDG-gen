import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 操作回数
        int k = sc.nextInt();// 操作Bの加算する値

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            if (ans * 2 < ans + k) {
                ans *= 2;
            } else {
                ans += k;
            }
        }

        System.out.println(ans);
    }
}
