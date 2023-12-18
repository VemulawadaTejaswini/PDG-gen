import java.io.*;
import java.util.*;
public class Main {
    static long[][][]memo;
    static long dp(int one,int pre,int idx){
        if (pre<0||pre>9)
            return 0;
        if (idx==10)
            return one;
        if (memo[one][pre][idx]!=-1){
            return memo[one][pre][idx];
        }
        if (one==0){
            long ans= dp(0,0,idx+1);
            for (int i =1;i<10;i++)
                ans+=dp(1,i,idx+1);
            return memo[one][pre][idx]=ans;
        }
        int nxt1=pre+1;
        int nxt2=pre-1;
        long ans=dp(one,pre,idx+1)+dp(1,nxt1,idx+1);
        if (nxt2>0) {
            ans += dp(1, nxt2, idx + 1);
        }
        else ans+=dp(one,nxt2,idx+1);
        return memo[one][pre][idx]=ans;
    }
    static  long c,k;
    static void trace(int one,int pre,int idx){
        if (idx==10)
            return;

        if (one==0){
             long x = dp(0,0,idx+1);
             if (c+x>=k){
                 trace(0,0,idx+1);
                 return;
             }
             c+=x;
            for (int i =1;i<10;i++) {
                x = dp(1, i, idx + 1);
                if (c+x>=k){
                    System.out.print(i);
                    trace(1,i,idx+1);
                    return;
                }
                c+=x;
            }
            return;
        }
        for (int j=-1;j<2;j++){
            int f= pre+j;
            if (pre+j<0)continue;
            long x=dp(one,pre+j,idx+1);
            if (x+c>=k){
                System.out.print(pre+j);
                trace(one,pre+j,idx+1);
                return;
            }
            c+=x;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        k = sc.nextInt();
        StringBuilder sol= new StringBuilder();
        memo= new long[2][10][10];
        for (long[][]z:memo)for (long[]x:z)Arrays.fill(x,-1);
        trace(0,0,0);
        pw.flush();
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