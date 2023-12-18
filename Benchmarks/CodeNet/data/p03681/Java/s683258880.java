import java.util.*;

public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long num = 1;
        long ans = 0;
        
        if (n - m == 1) {
            for (int i = 1; i <= m; i++) {
                num = (num * i) % 1000000007;
            }
            ans = (num * (num * n)) % 1000000007;
        } else if (n - m == -1) {
            for (int i = 1; i <= n; i++) {
                num = (num * i) % 1000000007;
            }
            ans = (num * (num * m)) % 1000000007;
        } else if (n - m == 0) {
            for (int i = 1; i <= n; i++) {
                num = (num * i) % 1000000007;
            }
            ans = (num * num * 2) % 1000000007;
        }
        System.out.println(ans);
    }
}
