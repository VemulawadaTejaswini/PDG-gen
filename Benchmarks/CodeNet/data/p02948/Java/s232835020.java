import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static final int MAX = 100005;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        Job[] jobs = new Job[MAX];
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (jobs[a] == null) jobs[a] = new Job();
            jobs[a].pay.add(b);
        }
        long ans = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = m - 1; i >= 0; --i) {
            if (jobs[m - i] != null) {
                for (int pay : jobs[m - i].pay) {
                    queue.offer(pay);
                }
            }
            if (!queue.isEmpty()) {
                ans += queue.poll();
            }
        }
        out.println(ans);
        out.close();
    }

    private static class Job {
        List<Integer> pay;

        Job() {
            pay = new ArrayList<>();
        }
    }
}
