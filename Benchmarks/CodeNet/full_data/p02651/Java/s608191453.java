import java.util.Scanner;
import java.awt.image.BandedSampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static int fun(long a)
    {
        String s=Long.toBinaryString(a);
        int len =s.length();
        int ans=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)-'0'==1)
            {ans++;}
        }
        return ans;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i=0;i<cases;i++)
        {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextLong();
            }
            String s=sc.next();

            long dp[] = new long[n+1];

            for(int j=1;j<n+1;j++)
            {
                if((s.charAt(j-1)+"").equals("1"))
                {
                    int x=fun(dp[j-1]);
                    int y=fun(dp[j-1]^arr[j-1]);
                    if(x>y)
                    {dp[j]=dp[j-1];}
                    else
                    {dp[j]=dp[j-1]^arr[j-1];}

                }
                else
                {
                    int x=fun(dp[j-1]);
                    int y=fun(dp[j-1]^arr[j-1]);
                    if(x<y)
                    {dp[j]=dp[j-1];}
                    else
                    {dp[j]=dp[j-1]^arr[j-1];}
                }
            }

            if(dp[n]==0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }



    }
}
