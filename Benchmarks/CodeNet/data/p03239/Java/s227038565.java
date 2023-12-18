import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        int n = sc.nextInt();
        int t = sc.nextInt();
        int ans = 1001;

        for(int i = 0; i < n; i++) {
            int c = sc.nextInt();
            if (sc.nextInt() <= t && c < ans) {
                ans = c;
            }
        }

        // 出力
        System.out.println(ans == 1001 ? "TLE" : ans);
    }
}
