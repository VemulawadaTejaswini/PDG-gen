import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
                    System.out.println(52/0);
                }
            }
        }, "1", 1 << 26).start();
        
    }
    static ArrayList<Point> g[];
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        int m=in.nextInt();
        g=new ArrayList[n+1];
        for(int i=0;i<=n;i++)
            g[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            int u=in.nextInt();
            int v=in.nextInt();
            int c=in.nextInt();
            g[u].add(new Point(v,c));
            g[v].add(new Point(u,c));
        }
        HashMap<Integer,Integer> s[]=new HashMap[n+1];
        for(int i=0;i<=n;i++)
            s[i]=new HashMap<>();
        int d[]=new int[n+1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[1]=0;
        boolean vis[]=new boolean[n+1];
        PriorityQueue<Point> pq=new PriorityQueue<>((a,b)->Integer.compare(a.y, b.y));
        pq.add(new Point(1,0));
        while(!pq.isEmpty()){
            Point nd=pq.poll();
            if(vis[nd.x])
                continue;
            vis[nd.x]=true;
            for(Point edg:g[nd.x]){
                int nextWeight=Math.min(1+nd.y, s[nd.x].getOrDefault(edg.y, Integer.MAX_VALUE));
                s[edg.x].put(edg.y,Math.min(s[edg.x].getOrDefault(edg.y,Integer.MAX_VALUE), nextWeight));
                if(nextWeight<d[edg.x]){
                    d[edg.x]=nextWeight;
                    pq.add(new Point(edg.x, nextWeight));
                }
            }
        }
        out.println((d[n]==Integer.MAX_VALUE)?-1:d[n]);
        out.close();
        
    }
}
