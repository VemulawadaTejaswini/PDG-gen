import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Boolean[][][][]memo;
    static int[]arr;
    static ArrayList<String>sol;
    static boolean dp(int a,int b,int c,int idx){
        if (a<0||b<0||c<0||a>12||b>12||c>12)
            return false;
        if (idx==arr.length){
            return true;
        }
        if (memo[a][b][c][idx]!=null)
            return memo[a][b][c][idx];
        boolean ans=false;
        if (arr[idx]==0){
            ans|=dp(a-1,b+1,c,idx+1);
            if (ans){
                sol.add("B");
                return memo[a][b][c][idx]=ans;
            }
            ans|=dp(a+1,b-1,c,idx+1);
            if (ans){
                sol.add("A");
                return memo[a][b][c][idx]=ans;
            }
        }
        else if (arr[idx]==1){
            ans|=dp(a-1,b,c+1,idx+1);
            if (ans){
                sol.add("C");
                return memo[a][b][c][idx]=ans;
            }
            ans|=dp(a+1,b,c-1,idx+1);
            if (ans){
                sol.add("A");
                return memo[a][b][c][idx]=ans;
            }
        }
        else {
            ans|=dp(a,b+1,c-1,idx+1);
            if (ans){
                sol.add("B");
                return memo[a][b][c][idx]=ans;
            }
            ans|=dp(a,b-1,c+1,idx+1);
            if (ans){
                sol.add("C");
                return memo[a][b][c][idx]=ans;
            }
        }
        return memo[a][b][c][idx]=ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            String z = sc.next();
            if (z.equals("AB")) {
                arr[i] = 0;
            } else if (z.equals("AC")) {
                arr[i] = 1;
            } else arr[i] = 2;
        }
        memo = new Boolean[13][13][13][(int)1e5];
        sol = new ArrayList<>();
        if (dp(Math.min(a, 12), Math.min(b, 12), Math.min(c, 12), 0)) {
            Collections.reverse(sol);
            pw.println("Yes");
            for (String s : sol)
                pw.println(s);
        } else pw.println("No");
        pw.flush();
    }
    static long gcd(long a,long b){
        if (a==0)
            return b;
        return gcd(b%a,a);
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

        public int[] nextIntarr(int n)throws Exception{
            int[]a = new int[n];
            for (int i =0;i<n;i++)
                a[i]=nextInt();
            return a;
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