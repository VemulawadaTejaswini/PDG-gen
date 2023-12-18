import java.util.*;

class Main {
    // ABC152D
    static final long MOD = 1_000_000_007;
    // 10^9+7
    static final int MAX = 2_147_483_646;
    // intの最大値
    static final int INF = 1_000_000_000;

    // 10^9
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int ans = h/a + (h%a == 0?0:1);
        System.out.println(ans);
    }
   
}
