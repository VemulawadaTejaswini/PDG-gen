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
        long[] A = new long[3 * N];
        for (int i = 0; i < 3 * N; i++) {
            A[i] = scan.nextLong();
        }
        PriorityQueue<Long> red_queue = new PriorityQueue<>(Comparator.naturalOrder());
        long red_sum = 0;
        for (int i = 0; i < N; i++) {
            red_sum += A[i];
            red_queue.add(A[i]);
        }
        PriorityQueue<Long> blue_queue = new PriorityQueue<>(Comparator.reverseOrder());
        long blue_sum = 0;
        for (int i = 2 * N; i < 3 * N; i++) {
            blue_sum += A[i];
            blue_queue.add(A[i]);
        }
        long[] red_holder = new long[N+1];
        long[] blue_holder = new long[N+1];
        red_holder[0] = red_sum;
        for (int i = 1; i <= N; i++) {
            red_queue.add(A[N + i - 1]);
            red_sum += A[N + i - 1];
            red_sum -= red_queue.poll();
            red_holder[i] = red_sum;
        }
        blue_holder[0] = blue_sum;
        for (int i = 1; i <= N; i++) {
            blue_queue.add(A[N + N - i]);
            blue_sum += A[N + N - i];
            blue_sum -= blue_queue.poll();
            blue_holder[i] = blue_sum;
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i <= N; i++) {
            ans = Math.max(ans, red_holder[i]-blue_holder[N-i]);
        }
        System.out.println(ans);
    }
}
