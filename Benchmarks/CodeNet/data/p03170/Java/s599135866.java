import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        KStones solver = new KStones();
        solver.solve(1, in, out);
        out.close();
    }

    static class KStones {
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean[][] memo = new boolean[k + 1][2];
            for (int i = 0; i <= k; i++)
                memo[i][1] = true;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            for (int i = 1; i <= k; i++) {
                for (int player = 0; player < 2; player++) {
                    if (player == 0) {
                        for (int j = 0; j < n; j++)
                            if (arr[j] <= i)
                                memo[i][player] |= memo[i - arr[j]][player ^ 1];
                    } else {
                        for (int j = 0; j < n; j++)
                            if (arr[j] <= i)
                                memo[i][player] &= memo[i - arr[j]][player ^ 1];
                    }
                }
            }
            pw.println(memo[k][0] ? "First" : "Second");
        }

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

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

