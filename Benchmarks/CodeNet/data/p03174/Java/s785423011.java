import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        SolO sol = new SolO(n);
        for(int i = 0; i < n; ++i){
            for(int j =0; j < n; ++j)
                sol.match[i][j] = sc.scanInt();
        }
        // int res = sol.sol((1<<n)-1);
        int res = sol.sol2((1<<n)-1);
        System.out.println(res);
    }
}

class SolO {
    int n;
    int[][] match;
    int[] dp;
    int mod = 1000000007;
    
    SolO(int n){
        this.n = n;
        match = new int[n][n];
        dp = new int[1<<n];
        Arrays.fill(dp, -1);
    }
    
    // recursive
    int sol(int mask){
        if(mask == 0)
            return 1;
        if(dp[mask] >= 0)
            return dp[mask];
        long res = 0;
        int id = Integer.bitCount(mask);
        for(int i = 0; i < n; ++i){
            if((mask & (1<<i)) != 0 && match[id-1][i] == 1){
                res += sol( mask^(1<<i));
                if(res >= mod)
                    res-= mod;
            }
        }
        return dp[mask] = (int) res;
    }
    
    // iterative
    int sol2(int mask){
        dp[0] = 1;
        for(int i = 1; i <= mask; ++i){
            long res = 0;
            int id = Integer.bitCount(i);
            for(int j = 0; j < n; ++j){
                if((i & (1<<j)) != 0 && match[id-1][j] == 1){
                    res += dp[i^(1<<j)];
                    if(res >= mod)
                        res-= mod;
                }
            }
            dp[i] = (int) res;
        }
        return dp[(1<<n)-1];
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