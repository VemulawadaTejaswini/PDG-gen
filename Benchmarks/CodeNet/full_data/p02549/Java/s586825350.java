import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 998244353;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < k; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            for(int j = l; j <= r; j++){
                list.add(j);
            }
        }

        list.sort(Comparator.comparingInt(a -> a));

        long[] dp = new long[n * 2];
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            long sum = 0;
            for(Integer p : list){
                int sub = i - p;
                if(sub < 1){
                    break;
                }
                sum += dp[sub];
            }
            dp[i] = sum;
            dp[i] %= mod;
        }
        System.out.println(dp[n]);

    }
}