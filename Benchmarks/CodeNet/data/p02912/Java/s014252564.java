import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        long sum = solve(N, K, A);
        System.out.println(sum);
    }

    public static long solve(int n, int k, Long[] a) {
        Arrays.sort(a, Comparator.reverseOrder());
        Queue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            queue.add(a[i]);
        }

        while (k > 0) {
            Long poll = queue.poll();
            long in = poll / 2;
            queue.add(in);
            k--;
        }

        long sum = 0L;
        while (!queue.isEmpty()) {
            sum += queue.poll();
        }
        return sum;
    }
}

