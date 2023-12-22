import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] dp;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = scan.nextInt();
            }
            dp = new int[n];
            int res = dp[0] = a[0];
            for(int i = 1;i < n;i++){
                dp[i] = maximum(a[i],a[i]+dp[i-1]);
                res = maximum(res,dp[i]);
            }
            System.out.println(res);
        }
    }
    public static int maximum(int a,int b){
        return (a > b)?a:b;
    }
}