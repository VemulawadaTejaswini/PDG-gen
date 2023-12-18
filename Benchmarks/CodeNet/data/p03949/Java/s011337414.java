import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
    static Exception ex;
    public static void main(String args[]) throws Exception
    {
        Thread r=new Thread(null, new Runnable() {
            public void run() {
                try
                {
                    solve();
                }
                catch(Exception e)
                {
                    ex=e;
                }
            }
        }, "1", 1 << 26);
        r.start();
        r.join();
        if(ex!=null)
            throw ex;
    }
    static ArrayList<Integer> g[];
    static int v[];
    static Point pv[];
    static boolean isValid(Point p){
        return !(p.x>p.y||((!isInfinite(p))&&(p.x+p.y)%2!=0));
    }
    static boolean isInfinite(Point a){
        return a.x==Integer.MIN_VALUE&&a.y==Integer.MAX_VALUE;
    }
    static void merge(Point a, Point b, int chng){
        if(isInfinite(a)&&!isInfinite(b)){
            a.x=b.x-chng;
            a.y=b.y+chng;
            return;
        }else if(isInfinite(b)){
            return;
        }else{
            if((a.x+(b.x-chng))%2!=0){
              a.x=0;a.y=-1;
              return;
            }
            if(((b.x-chng)>a.y)||(a.x>(b.y+chng))){
                a.x=0;
                a.y=-1;
                return;
            }
            a.x=Math.max(a.x,b.x-chng);
            a.y=Math.min(a.y,b.y+chng);
            if(!isValid(a)){
                a.x=0;a.y=-1;
                return;
            }                
        }
    }
    static Point sol(int nd, int p, Point parV){
        //if node already has a value
        if(v[nd]!=Integer.MIN_VALUE){
            pv[nd]=new Point(v[nd], v[nd]);
            merge(pv[nd], parV,1);
            
        }
        else{
            pv[nd]=new Point(Integer.MIN_VALUE, Integer.MAX_VALUE);
            merge(pv[nd], parV,1);
        }
        if(!isValid(pv[nd]))
                return pv[nd];
        for(int nn:g[nd]){
            if(nn==p)
                continue;
            Point nnv=sol(nn,nd,pv[nd]);
            if(!isValid(nnv))
            {
                pv[nd]=new Point(0,-1);
                break;
            }
            merge(pv[nd],nnv,1);
            if(!isValid(pv[nd]))
                break;
        }
        return pv[nd];
    }
    static Point fill(int nd, int p, Point parV) throws IOException{
        //if node doesnot have a value create value
        if(v[nd]==Integer.MIN_VALUE){
            merge(pv[nd], parV, 1);
            if(isInfinite(pv[nd]))
                v[nd]=0;
            else
                v[nd]=pv[nd].x;
            if(!isValid(pv[nd])){
                throw new IOException("error in fill method");
            }
        }
        
        pv[nd]=new Point(v[nd],v[nd]);
        for(int nn:g[nd]){
            if(nn!=p){
                merge(pv[nd],fill(nn,nd,pv[nd]),1);
                if(!isValid(pv[nd])){
                    throw new IOException("error in fill method");
                }
            }
        }
        return pv[nd];
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        g=new ArrayList[n+1];
        for(int i=0;i<=n;i++)
            g[i]=new ArrayList<>();
        for(int i=1;i<n;i++){
            int u=in.nextInt();
            int v=in.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        v=new int[n+1];
        Arrays.fill(v, Integer.MIN_VALUE);
        pv=new Point[n+1];
        for(int i=in.nextInt();i>0;i--){
            v[in.nextInt()]=in.nextInt();
        }
        if(isValid(sol(1,0, new Point(Integer.MIN_VALUE, Integer.MAX_VALUE)))){
            out.println("Yes");
            fill(1,0, new Point(Integer.MIN_VALUE, Integer.MAX_VALUE));
            for(int i=1;i<=n;i++)
                out.println(v[i]);
            
        }
        else{
            out.println("No");
        }
        
        out.close();
        
    }
}
