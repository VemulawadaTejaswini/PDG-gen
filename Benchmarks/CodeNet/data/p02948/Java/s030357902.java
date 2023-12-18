/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue<Job> jobs = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int delay = sc.nextInt();
            int val = sc.nextInt();
            jobs.add(new Job(val, delay));
        }
        TreeSet<Integer> spots = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            spots.add(i);
        }
        int day = 0;
        long total = 0;
        while (day <= M && jobs.size() > 0) {
            while (jobs.size() > 0 && day + jobs.peek().delay > M) {
                jobs.poll();
            }
            if (jobs.size() == 0) {
                break;
            }
            // We want to use either M - day, or something earlier if taken!
            if (spots.lower(M - day + 1) != null) {
                int latestDay = spots.lower(M - day + 1);
                spots.remove(latestDay);
                // maintain invariant of best value on top
                total += jobs.poll().val;
                day++;
            }
        }
        out.println(total);
        out.close();
    }

    static class Job implements Comparable<Job>{
        int val, delay;

        public Job(int v, int d) {
            val = v; delay = d;
        }

        public int compareTo(Job j2) {
            return j2.val - val; // big val first!
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        FastScanner(FileReader s) {
            br = new BufferedReader(s);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        String nextLine() throws IOException { return br.readLine(); }

        double nextDouble() throws IOException { return Double.parseDouble(next()); }

        int nextInt() throws IOException { return Integer.parseInt(next()); }

        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}