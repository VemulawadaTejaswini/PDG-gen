import java.util.*;
import java.io.*;
 
public class Main{
  Scanner sc = new Scanner(System.in);	
 
  long mod = 1_000_000_000 + 7;
  
  public void run(){
    int s = sc.nextInt();
    
    long[] dp = new long[2001];
    Arrays.fill(dp,-1);
    dp[0] = 0;
    dp[1] = 0;
    dp[2] = 0;
    dp[3] = 1;
    
    for(int i = 3; i < 2001;i++ ){
      dp[i] = 1;
      for(int j = 3; i-j >= 3;j++){
        dp[i] = (dp[i] + dp[j])%mod;
        
      }
    }
    System.out.println((dp[s])%mod);
  }
  public static void main(String[] args){
    Main m = new Main();
    m.run();
  }
}