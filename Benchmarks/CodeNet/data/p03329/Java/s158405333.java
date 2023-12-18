import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int dp[] = new int[100010];
        for(int i = 1;i<100000;i++){
            dp[i] = Integer.MAX_VALUE;
            int power = 1;
            while(power<= i){
                dp[i] = Math.min(dp[i],dp[i-power]+1);
                power *= 6;
            }
            power = 1;
            while(power<= i){
                dp[i] = Math.min(dp[i],dp[i-power]+1);
                power *= 9;
            }
        }
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(dp[N]);
    }
}