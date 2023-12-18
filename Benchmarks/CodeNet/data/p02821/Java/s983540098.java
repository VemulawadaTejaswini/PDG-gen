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
        long M = scan.nextLong();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scan.nextInt());
        }
        A.sort(Comparator.reverseOrder());
        long[] sumA = new long[N+1];
        for (int i = 0; i < N; i++) {
            sumA[i+1] = sumA[i] + A.get(i);
        }

        long left = 0;
        long right = 20000000000L;
        while (left + 1 != right) {
            long mid = (left + right) / 2;
            long count = count(N, mid, A);
            if (M <= count) {
                left = mid;
            } else {
                right = mid;
            }
        }
        long ans = sum(N, M, left, A, sumA);
        System.out.println(ans);
    }

    private long sum(int N, long M, long threshold, List<Integer> A, long[] sumA) {
        long sum = 0;
        for (int i = 0; i < N && 0 < M; i++) {
            int c = lower_bound(N, A, threshold - A.get(i));
            long count = Math.min(M,c);
            M -= count;
            sum += (long) A.get(i) * count;
            sum += sumA[(int) count];
        }
        return sum;
    }
    private long count(int N, long threshold, List<Integer> A) {
        long count = 0;
        for (int i = 0; i < N; i++) {
            count += lower_bound(N, A, threshold - A.get(i));
        }
        return count;
    }
    private int lower_bound(int N, List<Integer> A, long threshold) {
        if (threshold > A.get(0)) {
            return 0;
        }
        if (A.get(N-1) >= threshold) {
            return N;
        }
        int left = -1;
        int right = N;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (threshold <= A.get(mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
