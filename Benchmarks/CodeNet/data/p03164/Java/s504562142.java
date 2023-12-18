import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    long[] val = new long[n];
    long[] wt = new long[n];
    long maxVal = 0;
    for(long i=0;i<n;i++){
      String[] str = br.readLine().split(" ");
      wt[(int)i] = Long.parseLong(str[0]);
      val[(int)i] = Long.parseLong(str[1]);
      maxVal += val[(int)i];
    }
    long[][] dp = new long[(int)n+1][(int)maxVal+1];
    
    for(int i=0;i<=n;i++){
      Arrays.fill(dp[i],100005);
    }
    
    for(long i=1;i<=n;i++){
      for(long j=0;j<=maxVal;j++){
        if(j==0)
          dp[(int)i][(int)j] = 0;
        else if(j>=val[(int)(i)-1] && dp[(int)(i)-1][(int)j-(int)val[(int)(i)-1]]!=100005)
          dp[(int)i][(int)j] = Math.min(dp[(int)(i)-1][(int)j], wt[(int)(i)-1] + dp[(int)(i)-1][(int)j-(int)val[(int)(i)-1]]);
        else
          dp[(int)i][(int)j] = dp[(int)(i)-1][(int)j];
      }
    }
    long max = 0;
    for(long i=0;i<=maxVal;i++){
      //System.out.print(dp[(int)n][(int)i]+" ");
      if(dp[(int)n][(int)i]<=W)
        max = i;
  }
    System.out.println(max);
  }
}