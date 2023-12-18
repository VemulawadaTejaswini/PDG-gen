import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main{
    static int n;
    static int memo[][];
    static int[][] val;
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();

        memo = new int[n][3];
        val = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                val[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++)
            Arrays.fill(memo[i],-1);


        out.println(dp(0,0));
        out.flush();
    }

    static int dp(int i,int prev){
        if (i == n)
            return 0;

        if (memo[i][prev] != -1)
            return memo[i][prev];

        int cost = 0;

        for (int j = 0; j < 3; j++) {
            if (i == 0 || prev != j)
                cost = Math.max(cost,dp(i+1,j) + val[i][j]);
        }

        return memo[i][prev] = cost;
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