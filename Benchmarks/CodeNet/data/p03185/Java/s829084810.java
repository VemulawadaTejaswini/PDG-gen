import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.TreeSet;
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
    static 
class CHT 
{

    TreeSet<Line> hull;
    int type;
    boolean query = false;
    Comparator<Line> comp = new Comparator<Line>() 
    {
        public int compare(Line a, Line b) 
        {
            if (!query) 
            {
                return type * Long.compare(a.m, b.m);
            }
            if (a.left == b.left) 
            {
                return Long.compare(a.m, b.m);
            }
            return Double.compare(a.left, b.left);
        }
    };

    public CHT(final int type) 
    {
        this.type = type;
        hull = new TreeSet<>(comp);
    }

    public void add(long m, long b) 
    {
        add(new Line(m, b));
    }

    public void add(Line a) 
    {
        Line[] LR = {hull.lower(a), hull.ceiling(a)};
        for (int i = 0; i < 2; i++) 
        {
            if (LR[i] != null && LR[i].m == a.m) {
                if (type == 1 && LR[i].b >= a.b) {
                    return;
                }
                if (type == -1 && LR[i].b <= a.b) {
                    return;
                }
                remove(LR[i]);
            }
        }

        hull.add(a);
        Line L = hull.lower(a), R = hull.higher(a);
        if (L != null && R != null && a.inter(R) <= R.left) 
        {
            hull.remove(a);
            return;
        }
        Line LL = (L != null) ? hull.lower(L) : null;
        Line RR = (R != null) ? hull.higher(R) : null;
        if (L != null) 
        {
            a.left = a.inter(L);
        }
        if (R != null) 
        {
            R.left = a.inter(R);
        }
        while (LL != null && L.left >= a.inter(LL)) 
        {
            remove(L);
            a.left = a.inter(L = LL);
            LL = hull.lower(L);
        }
        while (RR != null && R.inter(RR) <= a.inter(RR)) 
        {
            remove(R);
            RR.left = a.inter(R = RR);
            RR = hull.higher(R);
        }
    }

    public long query(long x) 
    {
        Line temp = new Line(0, 0, 0);
        temp.left = x;
        query = true;
        long ans = (long) hull.floor(temp).eval(x);
        query = false;
        return ans;
    }

    private void remove(Line x) 
    {
        hull.remove(x);
    }

    public int size() 
    {
        return hull.size();
    }

    static class Line 
    {

        long m, b;
        double left = Long.MIN_VALUE;

        public Line(long m, long x, long y) 
        {
            this.m = m;
            this.b = -m * x + y;
        }

        public Line(long m, long b) 
        {
            this.m = m;
            this.b = b;
        }

        public long eval(long x) 
        {
            return m * x + b;
        }

        public double inter(Line x) 
        {
            return (double) (x.b - this.b) / (double) (this.m - x.m);
        }
    }
}

    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        long c=in.nextLong();
        long h[]=in.nextLongArray(n);
        CHT t=new CHT(-1);
        long dp[]=new long[n];
        t.add(-2*h[0], c+h[0]*h[0]);
        for(int i=1;i<n;i++)
        {
            dp[i]=t.query(h[i]);
            dp[i]+=h[i]*h[i];
            t.add(-2*h[i],dp[i]+c+h[i]*h[i]);
        }
        out.println(dp[n-1]);
        out.close();
    }

}
