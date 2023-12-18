import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        int m = sc.scanInt();
        Sol sol = new Sol(n, m);
        while(n-- > 1){
            sol.ae(sc.scanInt(),sc.scanInt());
        }
        sol.sol();
    }
}

class Sol {
    int n, mod;
    ArrayList<Integer>[] adj;
    int[] in, out, ans, sib;
    
    Sol(int n, int m){
        this.n = n;
        this.mod = m;
        adj = new ArrayList[n+1];
        in = new int[n+1];
        out = new int[n+1];
        ans = new int[n+1];
        sib = new int[n+1];
        for(int i = 0; i <= n; ++i)
            adj[i] = new ArrayList<Integer>();
    }
    
    void ae(int a, int b){
        adj[a].add(b);
        adj[b].add(a);
    }
    
    void dfs1(int src, int par){
        // in[src] = #ways to paint this node black while keeping black nodes connected within it's subtree
        long res = 1;
        if(par == 0)
            sib[src] = 1;
        int sibs = adj[src].size();
        int sz = sibs;
        if(par != 0)
            sz--;
        int[] left_sibs = new int[sz];
        int[] right_sibs = new int[sz];
        int i = 0;
        for(int nbr : adj[src]){
            if(nbr == par)
                continue;
            dfs1(nbr, src);
            // 1 is added since there is one way to paint the subtree rooted at nbr as all white
            // since all black nodes need to be connected, if nbr is white, then the subtree rooted at nbr is all white
            res *= ((long)in[nbr]+1);
            res %= mod;
            left_sibs[i++] = (int) res;
        }
        in[src] = (int) res;
        res = 1;
        for(int it = sibs-1; it >= 0; --it){
            int nd = adj[src].get(it);
            if(nd == par)
                continue;
            res *= (in[nd]+1);
            res %= mod;
            right_sibs[--i] = (int) res;
        }
        i = 0;
        for(int it = 0; it < sibs; ++it){
            int nd = adj[src].get(it);
            if(nd == par)
                continue;
            res = 1;
            if(i > 0)
                res *= left_sibs[i-1];
            res %= mod;
            if(i < sz-1)
                res *= right_sibs[i+1];
            res %= mod;
            sib[nd] = (int) res;
            ++i;
        }
    }
    
    void dfs2(int src, int par){
        long res = 1;
        if(par == 0)
            out[src] = 0;
        else {
            res = ((long) out[par] + 1)* sib[src];
            out[src] = (int)(res%mod);
        }
        res = in[src] * ((long) out[src] + 1);
        ans[src] = (int)(res%mod);
        for(int nbr : adj[src]){
            if(nbr == par)
                continue;
            dfs2(nbr, src);
        }        
    }
    
    void sol() {
        dfs1(1, 0);
        dfs2(1, 0);
        for(int i = 1; i <= n; ++i)
            System.out.println(ans[i]);
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