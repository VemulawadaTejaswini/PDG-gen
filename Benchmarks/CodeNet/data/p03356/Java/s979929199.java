import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.HashSet;
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
    static class DSU
    {
        int n;
        int p[],r[];
        DSU(int j)
        {
            n=j+50;
            p=new int[n];
            r=new int[n];
            for(int i=0;i<n;i++)
                p[i]=i;
        }
        int find(int x)
        {
            if(p[x]==x)
                return x;
            return p[x]=find(p[x]);
        }
        boolean union(int a,int b)
        {
            a=find(a);
            b=find(b);
            if(a==b)
                return false;
            if(r[a]<=r[b])
            {
                p[a]=b;
                if(r[a]==r[b])
                    r[b]++;
            }
            else
                p[b]=a;
            return true;
        }
    }
    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        int m=in.nextInt();
        int p[]=in.nextIntArrayOneBased(n);
        DSU d=new DSU(n);
        for(int i=0;i<m;i++)
            d.union(in.nextInt(), in.nextInt());
        
        for(int i=1;i<=n;i++)
            d.find(i);
        
        HashSet<Integer> ind[]=new HashSet[n+1];
        HashSet<Integer> val[]=new HashSet[n+1];
        for(int i=0;i<=n;i++)
        {
            ind[i]=new HashSet<>();
            val[i]=new HashSet<>();
        }
        for(int i=1;i<=n;i++)
        {
            ind[d.p[i]].add(i);
            val[d.p[i]].add(p[i]);
        }
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            for(Integer a:ind[i])
            {
                if(val[i].contains(a))
                    ans++;
            }
        }
        out.println(ans);
        out.close();
    }

}
