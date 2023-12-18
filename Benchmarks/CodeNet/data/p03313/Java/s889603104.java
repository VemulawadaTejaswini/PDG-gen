import java.util.*;
import java.io.*;
import java.util.zip.Adler32;

public class Main {
    static Pair[]dp;
    static int[]a;
    static Pair dp(int i){
        if (i==0){
            return new Pair(0,-1);
        }
        if (dp[i]!=null)
            return dp[i];
        Pair sol = new Pair(i,-1);

        for (int j =0;j<18;j++){
            if ((i&1<<j)!=0){
                sol=maxmize(sol,dp(i^(1<<j)));
            }
        }
        return dp[i]=sol;
    }
    static Pair max(Pair x,Pair y){
        if (x.a==y.a)
        if (x.b>y.b)
            return x;
        return y;
    }
    static Pair maxmize(Pair x,Pair y){
        TreeSet<Integer>ts = new TreeSet<>((m,mm)->a[mm]==a[m]?m-mm:a[mm]-a[m]);
        ts.add(x.a);
        ts.add(y.a);
        if (x.b!=-1)ts.add(x.b);
        if (y.b!=-1)ts.add(y.b);
        return new Pair(ts.pollFirst(),ts.pollFirst());
    }
    static ArrayList<int[]>[]adj;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);;
        int n = sc.nextInt();
        a = new int[1<<n];
        dp= new Pair[1<<n];
        for (int i =0;i<1<<n;i++)a[i]=sc.nextInt();
        int[] ans = new int[1<<n];
        for (int i =1;i<1<<n;i++){
            Pair s = dp(i);
            ans[i]=a[s.a]+a[s.b] ;
            ans[i]=Math.max(ans[i],ans[i-1]);
            pw.println(ans[i]);
        }

        pw.flush();
    }
    static class Pair{
        int a,b;
        public Pair(int x ,int y){
            a=x;
            b=y;
        }

        @Override
        public Pair clone() {
            return new Pair(a,b);
        }
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}