import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	//try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, k;

		n = Integer.parseInt(br.readLine());
      	int[] a = new int[n-1];
      int[] dp = new int[n];
      long sum=0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(i=0;i<n-1;i++)
      {
        a[i]=Integer.parseInt(st.nextToken());
      }
      dp[0]=a[0];
      sum+=dp[0];
      for(i=1;i<n-1;i++)
      {
        	if(i-1>=0 && a[i]>a[i-1] && a[i]>dp[i-1])
            {
              dp[i]=dp[i-1];
              sum+=dp[i];
            }
        	else
            if(i-1>=0 && a[i]<=a[i-1] && a[i]>=dp[i-1])
            {
              dp[i]=a[i];
              sum+=dp[i];
            }
      }
      sum+=Math.max(dp[i-1],a[i-1]);
      out.print(sum);
	out.flush();
	out.close();
	//}catch(Exception e){}
	}
}