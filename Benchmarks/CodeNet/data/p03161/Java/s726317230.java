import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main{
    static int[] memo;
    static int[] val;
    static int n;
    static int k;
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        k = sc.nextInt();
        val = new int[n];

        for (int i = 0; i < n; i++)
            val[i] = sc.nextInt();

        memo = new int[n];
        Arrays.fill(memo,-1);


        out.println(dp(0));
        out.flush();
    }

    static int dp(int i){
        if (i == n-1)
            return 0;

        if (memo[i] != -1)
            return  memo[i];

        int one = Integer.MAX_VALUE-1;

        for (int j = 1; j <= k; j++) {
            if (i+j < n){
                one = Math.min(one,dp(i+j) + Math.abs(val[i]-val[i+j]));
            }
        }

        return memo[i] = one;
    }

}
class scanner{
    StringTokenizer st;
    BufferedReader br;
    public scanner(InputStream s){
        br = new BufferedReader(new InputStreamReader(s));
    }
    public scanner (String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(s));}

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return  Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public boolean ready() throws IOException {
        return br.ready();
    }
}