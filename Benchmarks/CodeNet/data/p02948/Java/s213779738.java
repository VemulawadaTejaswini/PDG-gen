import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            jobs[i] = new Job(a, b);
        }
        Arrays.sort(jobs);
        long ans = 0;
        int cur = 0;
        int t = Math.min(m, n);
        Arrays.sort(jobs, 0, t, (o1, o2) -> {
            if (o1.a == o2.a && o1.b == o2.b) return 0;
            if (o1.a < o2.a || o1.a == o2.a && o1.b < o2.b) return 1;
            return -1;
        });
        for (int i = 0; i < t; ++i) {
            //out.println(jobs[i].a + " " + jobs[i].b + ", cur: " + cur);
            if (jobs[i].a + cur <= m) {
                ans += jobs[i].b;
                cur++;
            }
        }
        out.println(ans);
        out.close();
    }

    private static class Job implements Comparable<Job> {
        long a, b;

        public Job(long a, long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Job o) {
            if (this.a == o.a && this.b == o.b) return 0;
            if (this.b < o.b || this.b == o.b && this.a > o.a) return 1;
            return -1;
        }
    }
}
