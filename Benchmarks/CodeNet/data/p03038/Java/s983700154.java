import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        Integer[] as = new Integer[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
            pq.add(as[i]);
        }
        
        for (int i = 0; i < m; i++) {
            int b = std.nextInt();
            int c = std.nextInt();
            int index = Math.min(b, pq.size());
            for (int j = 0; j < index; j++) {
                Integer now = pq.poll();
                if (now < c) {
                    pq.add(c);
                } else {
                    pq.add(now);
                }
            }
        }

        long ans = 0;
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }
        System.out.println(ans);
    }
}
