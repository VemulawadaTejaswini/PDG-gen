
import java.io.*;
import java.util.*;

public class ggg {
    public static long ciel(long x,long y){
        long res=x/y;
        if(x%y!=0)res++;
        return res;
    }
    public static boolean check(String str){
        if(str.equals(".")||str.equals(",")||str.equals("!")||str.equals("?"))return true;
        return false;
    }
    public static long gcd(long u,long v){
        if(v==0)return u;
        return gcd(v, u%v);
    }
    static int n,m,mod= (int) (1e9+7);
    static long memo[][];
    static long inf= (long) 1e18;
    static int[]cost,weight;
    public static long dp(int i,int rem){
        if(rem<0)return -1*inf;
        if(i==n)return 0;
     if(memo[i][rem]!=-1)return memo[i][rem];
     return memo[i][rem]=Math.max(dp(i+1, rem),cost[i]+ dp(i+1,rem-weight[i]));
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        n=sc.nextInt();
        int w=sc.nextInt();
        weight=new int[n];
        cost=new int[n];
    for(int i=0;i<n;i++){
        weight[i]=sc.nextInt();
        cost[i]=sc.nextInt();
    }
        memo=new long[n][w+1];
        for(long []x:memo)Arrays.fill(x, -1);
        pw.println(dp(0, w));
        pw.close();
    }

  public static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
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
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException, IOException {
            return br.ready();
        }

    }
}
