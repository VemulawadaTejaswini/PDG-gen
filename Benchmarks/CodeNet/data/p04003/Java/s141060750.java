import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
public class Main
{
    static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
    public static void main(String args[]) throws IOException
    {
        new Thread(null, new Runnable() {
            public void run() {
                try
                {
                    solve();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();
        
    }
    static class Pair{
        long x;
        int y;
        Pair(long a,int b){
            x=a;y=b;
        }
    }
    static ArrayList<Point> g[];
    static int d[];
    static boolean vis[];
    static HashMap<Integer, HashMap<Integer, Integer>> gg;
    static int tt=0;
    static int ensure(int u, int c){
        if(!gg.containsKey(u)){
            gg.put(u, new HashMap<>());
        }
        if(!gg.get(u).containsKey(c)){
            gg.get(u).put(c,tt);
            d[tt]=Integer.MAX_VALUE;
            g[tt]=new ArrayList<>();
            return tt++;
        }
        return gg.get(u).get(c);
    }
    static void addEdge(int u,int v,int c){
        
        int u0=ensure(u,0);
        int v0=ensure(v,0);
        int uc=ensure(u,c);
        int vc=ensure(v,c);
        addEdgeInternal(u0, uc, 1);
        addEdgeInternal(v0, vc, 1);
        addEdgeInternal(uc, vc, 0);
    }
    static void addEdgeInternal(int u, int v, int wt){
        g[u].add(new Point(v,wt));
        g[v].add(new Point(u, wt));
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        int m=in.nextInt();
        gg=new HashMap<>();
        g=new ArrayList[2000100];
        d=new int[2000100];
        vis=new boolean[2000100];
        for(int i=0;i<m;i++){
            int u=in.nextInt();
            int v=in.nextInt();
            int c=in.nextInt();
            addEdge(u, v, c);
        }
        int o0=ensure(1,0);
        int n0=ensure(n,0);
        
        d[o0]=0;
        PriorityQueue<Point> pq=new PriorityQueue<>((a,b)->Integer.compare(a.y, b.y));
        pq.add(new Point(o0,0));
        while(!pq.isEmpty()){
            Point nd=pq.poll();
            if(vis[nd.x])
                continue;
            vis[nd.x]=true;
            for(Point edg:g[nd.x]){
                int nextWeight=nd.y+edg.y;
                if(nextWeight<d[edg.x]){
                    d[edg.x]=nextWeight;
                    
                    pq.add(new Point(edg.x, nextWeight));
                }
            }
        }
        out.println((d[n0]==Integer.MAX_VALUE)?-1:(d[n0]/2));
        out.close();
        
    }
}
