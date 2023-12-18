import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n;
    char[][] boardA;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        boardA = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                boardA[i][j] = str.charAt(j);
            }
        }
        solve();
    }

    void solve() {
        long count = 0;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                boolean flag = true;
                b:
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (boardA[(i + a) % n][(j + b) % n] !=
                                boardA[(j + b) % n][(i + a) % n]) {
                            flag = false;
                            break b;
                        }
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        System.out.println(count);
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
