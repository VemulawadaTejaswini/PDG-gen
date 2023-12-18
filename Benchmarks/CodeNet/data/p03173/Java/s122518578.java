import java.util.*;

public class Main {
    private static long solve(int N, int[] a) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int ai: a) pq.add((long)ai);

        long result = 0;
        while (!pq.isEmpty()) {
            long m1 = pq.poll();
            if (pq.isEmpty()) break;
            long m2 = pq.poll();

            long sum = m1 + m2;
            result += sum;
            pq.add(sum);
        }
        return result;
    }

    public static long run(Scanner scanner) {
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i=0; i < N; i++) a[i] = scanner.nextInt();

        return solve(N, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}