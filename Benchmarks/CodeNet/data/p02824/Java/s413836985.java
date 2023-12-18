import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().runIO();
    }


    void solve() {
        int n = in.nextInt();
        int judges = in.nextInt();
        int chooseProblems = in.nextInt();
        int stayProblems = in.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = in.nextInt();
        }
        Arrays.sort(score);
        int lastBad = n - stayProblems;
        int left = -1, right = lastBad;
        while (right - left > 1) {
            int mid = (left + right) >> 1;
            // mid-th problem want to stay
            int badVotes = Math.max(0, chooseProblems - stayProblems - mid);
            int myScore = score[mid] + judges;
            long totalFree = 0;
            if (score[lastBad] > myScore) {
                left = mid;
                continue;
            }
            for (int i = mid + 1; i <= lastBad; i++) {
                totalFree += myScore - score[i];
            }
            if (totalFree >= badVotes * 1L * judges) {
                right = mid;
            } else {
                left = mid;
            }
        }
        out.println(n - right);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
