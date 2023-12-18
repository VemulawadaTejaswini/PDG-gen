import java.util.*;
import java.io.*;
public class Main
{
    static int solve(int h,int k,int height[])
    {
        if(h == 1)
        return 0;
        int dp[] = new int[h];
        dp[0]=0;
        for(int i=1;i<h;i++)
        {
            dp[i] = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++)
            {
                if(i-j>=0)
                dp[i]=Math.min(dp[i-j]+getAbsoluteValue(height[i],height[i-j]),dp[i]);
            }
        }
        return dp[h-1];
   }
    static int getAbsoluteValue(int a,int b)
    {
        return Math.abs(a-b);
    }
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int hk[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int height[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Integer.toString(solve(hk[0],hk[1],height)));
        br.close();
        bw.close();
    }
}
