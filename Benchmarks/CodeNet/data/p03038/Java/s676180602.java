import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        int[] B = new int[m], C = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        System.out.println(sln(n, m, A, B, C));
    }

    public static long sln(int n, int m, int[] A, int[] B, int[] C) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : A) pq.offer(a);
        for (int i = 0; i < m; i++) {
            int k = B[i], v = C[i];
            for (int j = 0; j < k; j++) {
                int p = pq.peek();
                if (p < v) {
                    pq.poll();
                    pq.offer(v);
                } else break;
            }
        }
        long sum = 0;
        while (!pq.isEmpty()) {
            sum += (long) pq.poll();
        }
        return sum;
    }
}
