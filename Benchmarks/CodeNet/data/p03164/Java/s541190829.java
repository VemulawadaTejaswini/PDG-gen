import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    static int n;
    static int val[];
    static int weights[];
    static long memo[][];
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();
        int w = sc.nextInt();
        val = new int[n];
        weights = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
            val[i] = sc.nextInt();
            sum+= val[i];
        }

        memo = new long[n][sum+1];

        for (int i = 0; i < n; i++)
            Arrays.fill(memo[i],-1);

        int max = 0;

        for (int i = 1; i <= sum; i++) {
            if (dp(0,i) <= w)
                max = i;
        }

        out.println(max);
        out.flush();

    }

    static long dp(int i,int v){

        if (v == 0)
            return 0;

        if (i == n)
            return  (long) (1e9 +10);

        if (memo[i][v] != -1)
            return  memo[i][v];
        long take = (long) (1e9 +10);
        if (v-val[i] >= 0)
            take = dp(i+1,v-val[i]) + weights[i];

        long leave = dp(i+1,v);

        return memo[i][v] = Math.min(take,leave);
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