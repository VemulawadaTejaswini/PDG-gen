import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] l=new int[n];
        int[] r=new int[n];
        TreeSet<Integer> arr=new TreeSet<>();
        for(int i=0;i<k;i++)
        {
            l[i]=in.nextInt();
            r[i]=in.nextInt();
            for(int j=l[i];j<=r[i];j++)
                arr.add(j);
        }
        long[] dp=new long[n+1];
        //System.out.println(arr.size());
        dp[1]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j: arr)
            {
                if(i+j>n)
                    break;
                dp[i+j]+=dp[i];
                dp[i+j]%=998244353;
            }
        }
        System.out.println(dp[n]);
    }

}
