import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n;
    int[] ts, as;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        ts = new int[n];
        as = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = sc.nextInt();
            as[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        long tVote = ts[0];
        long aVote = as[0];
        for (int i = 1; i < n; i++) {
            //long k = Math.max(tVote / ts[i], aVote / as[i]);
            long newTVote = ts[i];
            long newAVote = as[i];
            while (newTVote < tVote || newAVote < aVote) {
                newTVote += ts[i];
                newAVote += as[i];
            }
            tVote = newTVote;
            aVote = newAVote;
        }
        System.out.println(tVote + aVote);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
