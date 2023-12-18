import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();

        if (t <= 1) {
            System.out.println(--k);
            return;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < t; i++) {
            queue.add(sc.nextInt());
        }

        int parent = queue.poll();
        while (!queue.isEmpty()) {
            int target = queue.poll();
            parent = Math.abs(parent - target);
        }

        System.out.println(--parent);
    }
}