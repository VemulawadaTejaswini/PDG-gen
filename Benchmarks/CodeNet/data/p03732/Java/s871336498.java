import java.util.*;
import java.lang.*;

 
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long w=sc.nextInt();
            int[][] dp=new int[n+1][(int)w+1];
             
            for(int i=1;i<=n;i++){
                int tw=sc.nextInt();
                int tv=sc.nextInt();
                for(int j=1;j<=w;j++){
                    if(j-tw<0){
                        dp[i][j]=dp[i-1][j];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-tw]+tv);
                    }
                }
            }
            System.out.println(dp[n][(int)w]);
        }
    }
}