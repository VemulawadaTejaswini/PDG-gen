import java.util.*;
import java.io.*;
public class Solution
{
    static int solve(int h,int height[])
    {
        if(h == 1)
        return 0;
        int dp[] = new int[h];
        dp[0]=0;
        dp[1]=getAbsoluteValue(height[0],height[1]);
        for(int i=2;i<h;i++)
        {
            dp[i]=Math.min(dp[i-1]+getAbsoluteValue(height[i],height[i-1]),dp[i-2]+getAbsoluteValue(height[i],height[i-2]));
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
        int h = Integer.parseInt(br.readLine());
        int height[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Integer.toString(solve(h,height)));
        br.close();
        bw.close();
    }
}
