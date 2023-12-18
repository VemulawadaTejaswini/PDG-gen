import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 510000;
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.COMinit();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int count = map.getOrDefault(A[i], 0);
            map.put(A[i], count + 1);
        }
        List<Point> list = new ArrayList<>();
        for (int x : map.keySet()) {
            Point p = new Point(x, map.get(x));
            list.add(p);
        }
        list.sort(new PointComparator());
        int len = list.size();
        long answer = 0;
        for (int i = 0; i < len; i++) {
            int start_group = list.get(i).count;
            int count = start_group;
            for (int j = i + 1; j < len; j++) {
                int end_group = list.get(j).count;
                count += end_group;
                if (count < K) {
                    continue;
                }
                int middle_group = count - start_group - end_group;
                for (int k = 1; k <= start_group; k++) {
                    for (int l = 1; l <= end_group; l++) {
                        int middle = middle_group + start_group - k + end_group - l;
                        if (middle < K - 2) {
                            continue;
                        }
                        long x = COM(middle, K - 2) * (list.get(j).x - list.get(i).x);
                        x %= MOD;
                        answer += x;
                        answer %= MOD;
                    }
                }
            }
        }
        System.out.println(answer);
    }
    void COMinit() {
        this.fac = new long[MAX_LEN];
        this.finv = new long[MAX_LEN];
        this.inv = new long[MAX_LEN];
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        for (int i = 2; i < MAX_LEN; i++) {
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }
    long COM(int n, int k) {
        if (n < k) {
            return 0;
        };
        if (n <0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k]%MOD)%MOD;
    }
    class Point {
        int x;
        int count;
        Point(int x, int count) {
            this.x = x;
            this.count = count;
        }
    }
    class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            return Integer.compare(o1.x, o2.x);
        }
    }
}
