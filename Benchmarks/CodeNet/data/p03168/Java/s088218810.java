import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        SolI sol = new SolI(n);
        for(int i = 1; i <= n; ++i)
            sol.probs[i] = sc.scanDouble();
        sol.sol();
    }
}

class SolI {
    double[][] best;
    double[] probs;
    int n;
    
    SolI(int n){
        this.n = n;
        probs = new double[n+1];
        best = new double[n+1][n+1];
    }
    
    void sol(){
        best[1][0] = 1-probs[1];
        best[1][1] = probs[1];
        for(int i = 2; i <= n; ++i){
            for(int j = 0; j <= i; ++j){
                best[i][j] = best[i-1][j]*(1-probs[i]);
                if(j > 0)
                    best[i][j] += best[i-1][j-1]*probs[i];
            }
        }
        double res = 0;
        for(int j = (n+1)/2; j <= n; ++j){
            res += best[n][j];
        }
        System.out.println(res);
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