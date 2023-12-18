import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long D = A - B;
        PriorityQueue<Long> h = new PriorityQueue<Long>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            h.add(sc.nextLong());
        }

        long ans = 0;
        while (true) {
            long tmpH = h.poll();
            if (tmpH - ans * B <= 0) break;

            h.add(tmpH - D);
            ans++;
        }

        System.out.println(ans);
    }
}