import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        long[] sum = new long[N+1];
        for (int i = 0; i < N; i++) {
            sum[i+1] = sum[i] + a[i];
        }
        List<Long> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                list.add(sum[j]-sum[i-1]);
            }
        }
        list.sort(Comparator.reverseOrder());
        long max = list.get(0);
        int len = length(max);
        List<Long>[] summary = new List[len];
        for (int i = 0; i < len; i++) {
            summary[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            long org = list.get(i);
            int current = 0;
            long x = org;
            while (0 < x) {
                if (0 < (x & 1)) {
                    summary[current].add(org);
                }
                current += 1;
                x /= 2;
            }
        }
        int index = -1;
        for (int i = len-1; 0 <= i; i--) {
            if (K <= summary[i].size()) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(0);
        }
        List<Long> candidates = summary[index];
        long ans = pow(index);
        for (int i = index - 1; 0 <= i; i--) {
            if (summary[i].size() < K) {
                continue;
            }
            List<Long> next_candidates = intersection(candidates, summary[i]);
            if (next_candidates.size() < K) {
                continue;
            }
            candidates = next_candidates;
            ans += pow(i);
        }
        System.out.println(ans);
    }
    private long pow(int len) {
        if (len == 0) {
            return 1;
        }
        if (len % 2 == 1) {
            return 2 * pow(len - 1);
        }
        long x = pow(len / 2);
        return x * x;
    }
    private List<Long> intersection(List<Long> a, List<Long> b) {
        HashSet<Long> set = new HashSet<>();
        for (long x : b) {
            set.add(x);
        }
        List<Long> result = new ArrayList<>();
        for (long x : a) {
            if (set.contains(x)) {
                result.add(x);
            }
        }
        return result;
    }
    private int length(long n) {
        int len = 0;
        while (0 < n) {
            n /= 2;
            len += 1;
        }
        return len;
    }
}
