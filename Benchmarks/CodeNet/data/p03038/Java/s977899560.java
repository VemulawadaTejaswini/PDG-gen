

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Long> A = new PriorityQueue<>();
        int[] B = new int[m];
        long[] C = new long[m];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            A.offer(num);
            sum += num;
        }

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
            C[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < B[i]; j++) {
                long a = A.peek();
                if (a < C[i]) {
                    sum -= a;
                    sum += C[i];
                    A.poll();
                    A.offer(C[i]);
                }
            }
        }
        System.out.println(sum);
    }
}
