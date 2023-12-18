import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
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
        return lcp;
    }
    static class SegmentTree{
        int n,t[][];
        SegmentTree(int a[]){
            int l=a.length;
            int p2=1;n=0;
            while(p2<l){
                p2*=2;
                n++;
            }
            t=new int[n+1][l];
            System.arraycopy(a, 0, t[0], 0, l);
            for(int i=1;i<=n;i++){
                p2=1<<(i-1);
                for(int j=0;j<=l-2*p2;j++){
                    t[i][j]=Math.min(t[i-1][j], t[i-1][j+p2]);
                }
            }
            
        }
        
        int min(int l,int r){
            int ans=Integer.MAX_VALUE;
            for(int i=n;i>=0;i--){
                if(l+((1<<i)-1)<=r){
                    ans=Math.min(ans,t[i][l]);
                    l+=(1<<i);
                }
            }
            return ans;
        }
        
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        String s=in.next();
        if(s.length()==1){
            System.out.println("1\n1");
            return;
        }
        boolean vs[]=vs(s);
        if(vs[0]){
            out.println(1);
            out.println(1);
        }
        else{
            int cnt=0;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    cnt++;
                }
            }
            if(cnt==s.length()-1){
                out.println(s.length());
                out.println(1);
            }else{
                String sr=reverse(s);
                boolean vp[]=reverse(vs(sr));
                cnt=0;
                for(int i=1;i<s.length();i++){
                    if(vs[i]&&vp[i-1])
                        cnt++;
                }
                out.println(2);
                out.println(cnt);
            }
        }
        out.close();
        
    }
    static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    static boolean[] reverse(boolean[] a){
        int i=0,j=a.length-1;
        while(i<j){
            a[i]^=a[j];
            a[j]^=a[i];
            a[i]^=a[j];
            i++;
            j--;
        }
        return a;
    }
    static boolean[] vs(String s){
        int sa[]=suffixArray(s);
        int lcp[]=lcp(sa,s);
        int n=s.length();
        SegmentTree st=new SegmentTree(lcp);
        int rm[]=new int[n];
        for(int i=0;i<n;i++){
            rm[sa[i]]=i;
        }
        boolean vs[]=new boolean[n];
        Arrays.fill(vs,true);
        for(int i=1;i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                if(!vs[n-j])
                    continue;
                int p1=rm[n-i];
                int p2=rm[n-j];
                int p3=rm[n-(j-i)];
                if(st.min(Math.min(p1, p2), Math.max(p1,p2)-1)==i&&st.min(Math.min(p3, p2), Math.max(p3,p2)-1)==j-i)
                    vs[n-j]=false;
            }
        }
        return vs;
    }
}
