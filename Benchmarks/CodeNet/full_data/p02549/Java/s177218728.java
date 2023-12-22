import java.util.*;

public class Main{
    static long ans = 0;
    static int mod = 998244353;
    public static void main(String[] args) {
        ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer>arr = new ArrayList<>();

        for(int i = 0;i < k;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l;j <= r;j++){
                arr.add(j);
            }
        }
        arr.sort((o1, o2) -> o1 - o2);
        long[]dp = new long[n + 1];
        dp[1] = 1;
        for(int i = 2;i <= n ;i++){
            for(int j = 0;j < arr.size();j++){
                int bf = i - arr.get(j);
                if(bf >= 0){
                    dp[i] += dp[bf] % mod;
                    dp[i] %= mod;
                }else{
                    break;
                }
            }
        }
        System.out.println(dp[n]);
    }

}
