//I AM THE CREED
/* //I AM THE CREED
/* package codechef; // don't place package name! */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
import java.awt.Point;
public class Main{
    public static void main(String[] args) throws IOException 
    { 
  
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            long[] dp=new long[n+1];
            long mod=1000000007;
            for(int i=0;i<=n;i++){
                for(int j=3;j<=i;j++){
                    dp[i]=(dp[i]+(dp[i-j]))%mod;
                }
                if(i>=3){
                    dp[i]=(dp[i]+1)%mod;
                }
            }
            System.out.println(dp[n]);
            
        }
    }

}