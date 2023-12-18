import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        SolJ sol = new SolJ(n);
        for(int i = 0; i < n; ++i){
            sol.counts[sc.scanInt()]++;
        }
        sol.sol();
    }
}

class SolJ {
    int[] counts;
    double[][][] dp;
    int n;
    
    SolJ(int n){
        this.n = n;
        counts = new int[4];
        dp = new double[n+1][n+1][n+1];
        for(int i = 0; i <= n; ++i)
            for(int j = 0; j <= n; ++j)
                Arrays.fill(dp[i][j], -1);
    }
    
    void sol(){
        System.out.println(dfs(counts));
    }
    
    double dfs(int[] counts){
        double sum = (double)( counts[1] + counts[2] + counts[3]);
        if(sum == 0.0)
            return 0;
        if(dp[counts[1]][counts[2]][counts[3]] > 0)
            return dp[counts[1]][counts[2]][counts[3]];
        double op = n/sum;
        double prob = 0;
        double tres = 0;
        if(counts[1] > 0){
            prob = (counts[1]/sum);
            tres += (op + dfs(new int[]{0, counts[1]-1, counts[2], counts[3]}))*prob;
        }
        if(counts[2] > 0){
            prob = (counts[2]/sum);
            tres += (op + dfs(new int[]{0, counts[1]+1, counts[2]-1, counts[3]}))*prob;
        }
        if(counts[3] > 0){
            prob = (counts[3]/sum);
            tres += (op + dfs(new int[]{0, counts[1], counts[2]+1, counts[3]-1}))*prob;
        }
        return dp[counts[1]][counts[2]][counts[3]] = tres;
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