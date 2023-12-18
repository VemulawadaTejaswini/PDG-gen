
import java.io.*;
import java.util.*;
public class Main {
    static boolean check(String s){
        if (s.length()<=1)
            return true;
        for (int i =0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
    static long nc2(int n){
        return 1l*n*(n-1)/2;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]a = new int[n];
        int[] c= new int[n+1];
        long ans=0;
        for (int i =0;i<n;i++){
            a[i]=sc.nextInt();
            c[a[i]]++;
        }
        for (int i =1;i<=n;i++){
            ans+=nc2(c[i]);
        }
        for (int i =0;i<n;i++){
            pw.println((ans-nc2(c[a[i]])+nc2(c[a[i]]-1)));
        }
        pw.flush();
    }
    static int gcd(int x,int y){
        if (x==0)
            return y;
        return gcd(y%x,x);
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

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

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

}