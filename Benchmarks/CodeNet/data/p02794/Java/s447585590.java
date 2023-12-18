import java.io.*;
import java.util.*;

class Main {
    static int n,m;
    static List<Pair>[] adjList;
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        n = sc.scanInt();
        adjList = new ArrayList[n];
        // init adjList
        for(int i = 0; i < n; ++i)
            adjList[i] = new ArrayList<Pair>();
        for(int i = 0; i < n-1; ++i){
            int from = sc.scanInt()-1;
            int to = sc.scanInt()-1;
            adjList[from].add(new Pair(i,to));
            adjList[to].add(new Pair(i,from));
        }
        m = sc.scanInt();
        long[] masks = new long[m];
        for(int i = 0; i < m; ++i){
            int from = sc.scanInt()-1;
            int to = sc.scanInt()-1;
            masks[i] = dfs(from,to,-1);
        }
        long res = 1<<(n-1);
        for(int i = 1; i < (1<<m); ++i){
            long totPathMask = 0;
            int nSetBits = 0;
            for(int bit = 0; bit < m; ++bit){
                if((i&(1<<bit)) > 0){
                    totPathMask |= masks[bit];
                    ++nSetBits;
                }
            }
            int totPaths = Long.bitCount(totPathMask);
            if(nSetBits%2==0)
                res += 1<<(n-1-totPaths);
            else
                res -= 1<<(n-1-totPaths);
        }
        System.out.println(res);
    }
    // returns path from curr to tgt as a bitmask
    static long dfs(int curr, int tgt, int par){
        for(Pair nbr : adjList[curr]){
            int id = nbr.id;
            int to = nbr.to;
            if(to == par)
                continue;
            if(to == tgt){
                return (long)(1 << id);
            }
            else {
                long obtained = dfs(to, tgt, curr);
                if(obtained > 0){
                    return obtained | 1<< id;
                }
            }
        }
        return 0;
    }
}

class Pair {
    int id, to;
    Pair(int id, int to){
        this.id = id;
        this.to = to;
    }
}

class Scan
{
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