import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=0,w=0;
        if(scan.hasNext())
            n=scan.nextInt();
        if(scan.hasNext())
            w=scan.nextInt();

        long[] val=new long[n],weight=new long[n];
        for(int i=0;i<n;i++){
            if (scan.hasNext())
                weight[i] = scan.nextLong();
            if (scan.hasNext())
                val[i] = scan.nextLong();
        }
        long[][] dp=new long[n+1][w+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(j>=weight[i-1]){
                    dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-(int)weight[i-1]]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
