import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int a = scanner.nextInt();
            list.add(a);
        }
        long[] dp = new long[n+1];
        dp[0] = 1;
        if(!list.contains(1)){
            dp[1] = 1;
        }
        for(int i = 2; i <= n; i++){
            if(list.contains(i)){
                continue;
            }else{
                dp[i] = (dp[i-1] + dp[i-2])%1000000007;
            }
        }
        System.out.println(dp[n]);
    }
}