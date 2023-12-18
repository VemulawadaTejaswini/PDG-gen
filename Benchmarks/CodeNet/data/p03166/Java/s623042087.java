import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        int m = sc.scanInt();
        SolG sol = new SolG(n+1);
        while(m-- > 0){
            sol.ae(sc.scanInt(), sc.scanInt());
        }
        sol.sol();
    }
}

class SolG {
    int[] in, best;
    int n;
    ArrayList<Integer>[] adj;
    
    SolG(int n){
        this.n = n;
        in = new int[n];
        best = new int[n];
        adj = new ArrayList[n];
        for(int i= 0; i < n; ++i)
            adj[i] = new ArrayList<Integer>();
    }
    
    void ae(int i, int j){
        in[j]++;
        adj[i].add(j);
    }
    
    void sol(){
        for(int i = 0; i < n; ++i){
            if(in[i] == 0)
                dfs(i, 0);
        }
        int res = 0;
        for(int i = 0; i < n; ++i)
            res = Math.max(res, best[i]);
        System.out.println(res);
    }
    
    void dfs(int src, int soFar){
        best[src] = soFar;
        for(int nbr : adj[src]){
            int currV = best[nbr];
            if(soFar + 1 > currV)
                dfs(nbr, soFar + 1);
        }
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