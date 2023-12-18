import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long sum = 0;
        PriorityQueue<Long> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            long a =sc.nextLong();
            sum+=a;
            q.add(a);
        }

        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            long c = sc.nextLong();
            while (!q.isEmpty() && b-->0) {
                if (q.peek() < c) {
                    sum -= q.poll();
                    sum += c;
                    q.offer(c);
                } else {
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
