//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    private static long countBits(long N)
    {
        long count=0;
        while (N>0)
        {
            count+=N&1;
            N>>=1;
        }
        return count;
    }
    private static long countTimes(long N)
    {
        if(N==0) return 0;
        return 1+countTimes(N%countBits(N));
    }
    private static long pow(long a, long b, long MOD)
    {
        a%=MOD;
        long res=1;
        while (b>0)
        {
            if((b&1)==1)
                res=(res*a)%MOD;
            a=(a*a)%MOD;
            b>>=1;
        }
        return res%MOD;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        N=Integer.parseInt(br.readLine().trim());
        char str[]=br.readLine().trim().toCharArray();
        long count=0;

        for(i=0;i<N;i++) if(str[i]=='1') count++;
        StringBuilder sb=new StringBuilder();

        long val1=0,val2=0,val3=0;
        for(i=N-1;i>=0;i--)
        {
            if(str[i]=='0') continue;

            val1+=pow(2,N-i-1,count);
            val1%=count;

            val2+=pow(2,N-i-1,count+1);
            val2%=count+1;

            if(count>1)
            {
                val3+=pow(2,N-i-1,count-1);
                val3%=count-1;
            }
        }

        for(i=0;i<N;i++)
        {
            if(str[i]=='0')
            {
                long tmp=val2;
                tmp+=pow(2,N-i-1,count+1);
                tmp%=count+1;
                sb.append(1+countTimes(tmp)).append("\n");
            }
            else
            {
                if(count==1) sb.append(0).append("\n");
                else
                {
                    long tmp=val3;
                    tmp-=pow(2,N-i-1,count-1);
                    tmp%=count-1;
                    if(tmp<0) tmp+=count-1;
                    sb.append(1+countTimes(tmp)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}