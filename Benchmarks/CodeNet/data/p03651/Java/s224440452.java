import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        if (queue.contains(k)) {
            System.out.println("POSSIBLE");
            return;
        }
        int min = queue.poll();
        while (!queue.isEmpty()) {
            int v = queue.poll();
            if (v % min > 0) {
                System.out.println("POSSIBLE");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}