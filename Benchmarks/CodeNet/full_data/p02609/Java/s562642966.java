import java.util.*;
import java.io.*;
public class Main
{
    public static long pow(long x,int e,long m)
    {
        long ans=1;
        while(e>0)
        {
            if(e%2!=0)
            {
                ans*=x;
                ans%=m;
                e--;
            }
            else
            {
                x=x*x;
                e/=2;
                x%=m;
            }
        }
        return ans;
    }
    public static int countSetBits(long ans)
    {
        int cntr=0;
        while(ans>0)
        {
            if((ans&1)==1)
            cntr++;
            ans>>=1;
        }
        return cntr;
    }
    public static int steps(long ans)
    {
        int bits=countSetBits(ans);
        if(bits==0)
        return 0;
        return 1+steps(ans%bits);
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        char carr[]=br.readLine().toCharArray();
        int o=0;
        for(int i=0;i<n;i++)
        if(carr[i]=='1')o++;
        int m1=o-1,m2=o+1;
        long ans1=0,ans2=0;
        for(int i=n-1;i>=0;i--)
        {
            if(m1>0)
            {
                ans1+=(carr[i]-'0')*pow(2,n-1-i,m1);
                ans1%=m1;
            }
            ans2+=(carr[i]-'0')*pow(2,n-1-i,m2);
            ans2%=m2;
        }
        for(int i=0;i<n;i++)
        {
            long ans=0;
            if(carr[i]=='0')
            {
                ans=(ans2+pow(2,n-1-i,m2))%m2;
                ans=1+steps(ans);
            }
            else
            {
                if(m1>0)
                {
                    ans=(ans1-pow(2,n-1-i,m1)+m1)%m1;
                    ans=1+steps(ans);
                }
            }
            pw.println(ans);
        }
        pw.flush();
        pw.close();
    }
}