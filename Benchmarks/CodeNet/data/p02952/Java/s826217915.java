import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = String.valueOf(n).length();
        int ans = 0;
        for (int i = 1; i <= digits; i++) {
            if (i % 2 == 1) {
                if (i == digits) {
                    ans += n - (int)Math.pow(10, i-1) + 1;
                } else {
                    ans += (int)Math.pow(10, i-1) * 9;
                }
            }
        }
        // 出力
        System.out.println(ans);
    }
}
