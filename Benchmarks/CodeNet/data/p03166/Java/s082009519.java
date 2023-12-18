import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    static int[] memo;
    static ArrayList<Integer>[] adjlist;
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();

        adjlist = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjlist[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++)
            adjlist[sc.nextInt()-1].add( sc.nextInt()-1);

        memo = new int[n];
        Arrays.fill(memo,-1);
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (memo[i] == -1)
                dp(i);

            max = Math.max(memo[i],max);
        }
        out.println(max);
        out.flush();

    }

    static int dp(int i){

        if (memo[i] != -1)
            return  memo[i];

        int max = 0;
        for (int nxt: adjlist[i]) {
            max = Math.max(max,dp(nxt)+1);
        }
        return memo[i] = max;
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