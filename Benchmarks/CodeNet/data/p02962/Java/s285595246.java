import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Main {
    static class Scanner {
        BufferedReader br;
        StringTokenizer tk = new StringTokenizer("");

        public Scanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        public int nextInt() throws IOException {
            if (tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextInt();
        }

        public long nextLong() throws IOException {
            if (tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextLong();
        }

        public String next() throws IOException {
            if (tk.hasMoreTokens())
                return (tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return next();
        }

        public String nextLine() throws IOException {
            tk = new StringTokenizer("");
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            if (tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextDouble();
        }

        public char nextChar() throws IOException {
            if (tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk = new StringTokenizer(br.readLine());
            return nextChar();
        }

        public int[] nextIntArray(int n) throws IOException {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public int[] nextIntArrayOneBased(int n) throws IOException {
            int a[] = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArrayOneBased(int n) throws IOException {
            long a[] = new long[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextLong();
            return a;
        }


    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();

    }
    static int[] Z(char[] s){
        int n=s.length;
        int z[]=new int[n];
        for(int i=1,l=0,r=0;i<n;i++){
            if(i<=r)
                z[i]=Math.min(r-i+1, z[i-l]);
            while(i+z[i]<n && s[z[i]]==s[i+z[i]])
                z[i]++;
            if(i+z[i]-1>r){
                l=i;
                r=i+z[i]-1;
            }
        }
        return z;
    }
    static int[] Z(String s){
        return Z(s.toCharArray());
    }
    static void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String s=in.next();
        String t=in.next();
        int m=s.length();
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()<2*t.length())
            sb.append(t);
        s=sb.toString();
        String p=t+"#"+s;
        int z[]=Z(p);
        int v[]=new int[m];
        int ans=0;
        int n=t.length();
        int av[]=new int[m];
        for(int i=n+1;i<=n+m;i++)
            av[i-(n+1)]=z[i];
        for(int i=0;i<m;i++){
            if(av[i]==n&&v[i]==0){
                ArrayList<Integer> ar=new ArrayList<>();
                HashSet<Integer> hs=new HashSet<>();
                int sp=i;
                while(av[sp]==n){
                    if(hs.contains(sp)){
                        ans=-1;
                        break;
                    }
                    if(v[sp]!=0)
                        break;
                    ar.add(sp);
                    hs.add(sp);
                    sp+=n;
                    sp%=m;
                }
                if(ans==-1)
                    break;
                if(v[sp]!=0){
                    for(int j=ar.size()-1;j>=0;j--){
                        v[ar.get(j)]=ar.size()-j+v[sp];
                    }
                    ans=Math.max(ans, v[ar.get(0)]);
                }
                else{
                    for(int j=ar.size()-1;j>=0;j--){
                        v[ar.get(j)]=ar.size()-j;
                    }
                    ans=Math.max(ans, v[ar.get(0)]);
                }



            }
        }
        out.println(ans);
        out.close();

    }
}
