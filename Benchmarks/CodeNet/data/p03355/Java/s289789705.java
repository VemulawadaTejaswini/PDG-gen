import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
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
    public static int[] suffixArray(CharSequence S) 
    {
        int n = S.length();
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++)
            order[i] = n - 1 - i;
        Arrays.sort(order, (a, b) -> Character.compare(S.charAt(a), S.charAt(b)));

        int[] sa = new int[n];
        int[] classes = new int[n];
        for (int i = 0; i < n; i++) 
        {
            sa[i] = order[i];
            classes[i] = S.charAt(i);
        }
        for (int len = 1; len < n; len *= 2) 
        {
            int[] c = classes.clone();
            for (int i = 0; i < n; i++) 
            {
                classes[sa[i]] = i > 0 && c[sa[i - 1]] == c[sa[i]] && sa[i - 1] + len < n && c[sa[i - 1] + len / 2] == c[sa[i] + len / 2] ? classes[sa[i - 1]] : i;
            }
            int[] cnt = new int[n];
            for (int i = 0; i < n; i++)
                cnt[i] = i;
            int[] s = sa.clone();
            for (int i = 0; i < n; i++) 
            {
                int s1 = s[i] - len;
                if (s1 >= 0)
                sa[cnt[classes[s1]]++] = s1;
            }
        }
        return sa;
    }
    static int[] lcp(int[] sa, CharSequence s) 
    {
        int n = sa.length;
        int[] rank = new int[n];
        for (int i = 0; i < n; i++)
        rank[sa[i]] = i;
        int[] lcp = new int[n-1];
        for (int i = 0, h = 0; i < n; i++) 
        {
            if (rank[i] < n - 1) 
            {
                for (int j = sa[rank[i] + 1]; Math.max(i, j) + h < s.length() && s.charAt(i + h) == s.charAt(j + h); ++h);
                lcp[rank[i]] = h;
                if (h > 0)
                    --h;
            }
        }
        int lcpp[]=new int[n];
        for(int i=1;i<n;i++)
            lcpp[i]=lcp[i-1];
        return lcpp;
    }
    static int cnt[];
    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        String s=in.next();
       
            
        char c[]=s.toCharArray();
        int sa[]=suffixArray(s);
        int lcp[]=lcp(sa,s);
        int n=s.length();
        cnt=new int[n];
        cnt[0]=n-sa[0];
        for(int i=1;i<n;i++)
        {
            cnt[i]=cnt[i-1]+n-lcp[i]-sa[i];
        }
        int q=1;
        while(q--!=0)
        {
            int x=in.nextInt();
            int y=x;
            x=Arrays.binarySearch(cnt,x);
            if(x<0)
            {
                x=-x;
                x-=2;
            }
            
            for(int i=sa[x];i<Math.min(n, n-cnt[x]+y);i++)
                out.print(c[i]);
            out.println();
        }
        out.close();
    }

}
