import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] choice = new int[n];
        boolean[] memo = new boolean[k+1];

        for (int i = 0; i < n; i++) {
            choice[i] = sc.nextInt();
        }

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= choice[j] && !memo[i-choice[j]])
                    memo[i] = true;
            }
        }

        out.println(memo[k]?"First":"Second");

        out.flush();

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

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public boolean ready() throws IOException {
        return br.ready();
    }
}