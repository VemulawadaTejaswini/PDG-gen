import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] aaa = sc.nextLine().split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(aaa[i]);
        }
        
        if(n==1){
            System.out.println(a[0]);
            return;
        }else if(n==2){
            System.out.println(Math.max(a[0],a[1]));
            return;
        }
        
        int[][] dp = new int[n+1][n+1];
        dp[0][0] = 1;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dp[i][j]==0) break;
                dp[i+1][j] += dp[i][j];
                dp[i+1][j+1] += dp[i][j]+a[i];
            }
        }
        
        int sum = -(n*(n+1)/2)-1;
        for(int i=0; i<n+1; i++){
            sum += dp[n][i];
        }
        
        int pow = (int)Math.pow(2, n);
        
        System.out.println(sum/pow);
        
    }
}
