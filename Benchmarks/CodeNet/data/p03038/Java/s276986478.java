

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Long> A = new PriorityQueue<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            A.offer(num);
            sum += num;
        }


        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            long c = sc.nextLong();
            for (int j = 0; j < b; j++) {
                long a = A.peek();
                if (a >= c) {
                    break;
                }
                sum -= a;
                sum += c;
                A.poll();
                A.offer(c);
            }
        }
        System.out.println(sum);
    }
}
