import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            long v1 = queue.isEmpty() ? 0 : queue.poll();
            long v2 = queue.isEmpty() ? 0 : queue.poll();
            long vs = v1 + v2;
            ans += Math.abs(vs);
        }

        System.out.println(ans);
    }
}