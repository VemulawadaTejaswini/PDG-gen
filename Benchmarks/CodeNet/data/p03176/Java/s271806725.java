import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        SolQ sol = new SolQ(n);
        int[] h = new int[n];
        for(int i = 0; i < n; ++i)
            h[i] = sc.scanInt();
        for(int i = 0; i < n; ++i)
            sol.add(h[i], sc.scanInt());
        System.out.println(sol.globMax);
        
    }
}

class SolQ {
    int n, mx;
    long globMax;
    long[] ft;
    
    SolQ(int n){
        this.n = n;
        mx = 200002;
        ft = new long[mx];
    }
    
    void update(int at, long by){
        for(int i = at; i < mx; i+=(i&(-i))){
            ft[i] = Math.max(ft[i], by);                
        }
    }
    
    long query(int at){
        long res = 0;
        for(int i = at; i > 0; i-=(i&(-i))){
            res = Math.max(res, ft[i]);
        }
        return res;
    }
    
    void add(int ht, long val){
        long get = query(ht-1)+val;
        globMax = Math.max(globMax, get);
        update(ht, get);
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