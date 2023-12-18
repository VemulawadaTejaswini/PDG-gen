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
        int M = scan.nextInt();
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
            int count = count(N, mid, A);
            if (M <= count) {
                left = mid;
            } else {
                right = mid;
            }
        }
        long ans = sum(N, M, left, A, sumA);
        System.out.println(ans);
    }

    private long sum(int N, int M, long threshold, List<Integer> A, long[] sumA) {
        long sum = 0;
        int j = N-1;
        for (int i = 0; i < N && 0 < M; i++) {
            while (0 <= j && A.get(i) + A.get(j) < threshold) {
                j -= 1;
            }
            int count = Math.min(M,j + 1);
            M -= count;
            sum += A.get(i) * count;
            sum += sumA[count];
        }
        return sum;
    }
    private int count(int N, long threshold, List<Integer> A) {
        int count = 0;
        int j = N-1;
        for (int i = 0; i < N; i++) {
            while (0 <= j && A.get(i) + A.get(j) < threshold) {
                j -= 1;
            }
            count += j + 1;
        }
        return count;
    }
}
