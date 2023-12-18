
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = std.nextInt();
        }

        long count = 0;
        for (int i = 1; i < n - 1; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(3);
            int left = p[i - 1];
            int right = p[i + 1];
            int v = p[i];
            pq.add(left);
            pq.add(right);
            pq.add(v);
            pq.poll();
            if (v == pq.poll()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
