import java.util.*;

public class Main {
    static final long TIME_LIMIT = System.currentTimeMillis() + 1900L;
    //-------------------------------------------------------------//
    public static final void main(String[] args) { new Main().solve(); }
    //-------------------------------------------------------------//
    Scanner sc = new Scanner(System.in);
    void solve() {
        int N = sc.nextInt();
        int W = sc.nextInt();
        List<Long>[] v = new ArrayList[4];
        for (int i = 0; i < 4; i++) v[i] = new ArrayList<>();
        long baseW = sc.nextLong();
        v[0].add(sc.nextLong());
        for (int i = 1; i < N; i++) {
            long w = sc.nextLong();
            v[(int)(w - baseW)].add(sc.nextLong());
        }

        if (baseW > W) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < 4; i++) Collections.sort(v[i], new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return Long.compare(o2, o1);
            }
        });

        long ans = 0;
        Random rnd = new Random();
        while (System.currentTimeMillis() < TIME_LIMIT) {
            int[] idx = new int[4];
            Arrays.fill(idx, 0);
            long cw = 0;
            long sum = 0;
            while (true) {
                int nxtIdx = rnd.nextInt(4);
                while (v[nxtIdx].size() <= idx[nxtIdx])
                    nxtIdx = rnd.nextInt(4);
                cw += nxtIdx + baseW;
                if (cw > W) break;
                sum += v[nxtIdx].get(idx[nxtIdx]);
                idx[nxtIdx]++;
                if (idx[0] == v[0].size() && idx[1] == v[1].size() && idx[2] == v[2].size() && idx[3] == v[3].size()) {
                    break;
                }
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}
