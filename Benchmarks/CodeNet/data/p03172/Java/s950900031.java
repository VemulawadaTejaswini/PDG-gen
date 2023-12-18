import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        int k = sc.scanInt();
        SolM sol = new SolM(n, k);
        for(int i = 0; i < n; ++i)
            sol.limits[i] = sc.scanInt();
        sol.sol();
    }
}

class SolM {
    int n,k;
    int[] limits;
    int[][] dp;
    int mod = 1000000007;
    
    SolM(int n, int k){
        this.n = n;
        this.k = k;
        limits = new int[n];
        dp = new int[n+1][k+1];
    }
    
    void sol(){
        dp[0][0] = 1;
        for(int i = 1; i <= n; ++i)
            dp[i][0] = 1;
        for(int i = 1; i <= k; ++i)
            dp[0][i] += dp[0][i-1];
        
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= k; ++j){
                long res = dp[i-1][j];
                if(limits[i-1] < j)
                    res -= dp[i-1][j-limits[i-1]-1];
                res += dp[i][j-1];
                if(res >= mod)
                    res -= mod;
                else if(res < 0)
                    res += mod;
                dp[i][j] = (int) res;
            }
        }
        
        System.out.println(dp[n][k] - (k > 0 ? dp[n][k-1] : 0));
    }
}

class Scan {
    private byte[] buf=new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Scan()
    {
        in=System.in;
    }
    public int scan()throws IOException
    {
        if(total<0)
        throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
            return -1;
        }
        return buf[index++];
    }
    public int scanInt()throws IOException
    {
        int integer=0;
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    public double scanDouble()throws IOException
    {
        double doub=0;
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n)&&n!='.')
        {
            if(n>='0'&&n<='9')
            {
                doub*=10;
                doub+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        if(n=='.')
        {
            n=scan();
            double temp=1;
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n=scan();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    }
    public String scanString()throws IOException
    {
        StringBuilder sb=new StringBuilder();
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        while(!isWhiteSpace(n))
        {
            sb.append((char)n);
            n=scan();
        }
        return sb.toString();
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}
