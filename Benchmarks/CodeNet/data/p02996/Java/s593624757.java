import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMegalomania solver = new DMegalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMegalomania {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            DMegalomania.Job[] jobs = new DMegalomania.Job[n];
            for (int i = 0; i < n; i++) {
                jobs[i] = new DMegalomania.Job(in.nextInt(), in.nextInt());
            }
            Arrays.sort(jobs, (j1, j2) -> j1.deadline - j2.deadline);
            long tot = 0;
            for (int i = 0; i < n; i++) {
                tot += jobs[i].time;
                if (tot > jobs[i].deadline) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

        static class Job {
            int time;
            int deadline;

            public Job(int time, int deadline) {
                this.time = time;
                this.deadline = deadline;
            }

        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

