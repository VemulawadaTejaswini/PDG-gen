import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        PriorityQueue<Order> changes = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            changes.add(new Order(sc.nextInt(), sc.nextInt()));
        }
        while (changes.size() > 0) {
            Order x = changes.poll();
            for (int i = 0; i < x.count && x.value > queue.peek(); i++) {
                queue.poll();
                queue.add(x.value);
            }
        }
        long total = 0;
        while (queue.size() > 0) {
            total += queue.poll();
        }
        System.out.println(total);
    }
    
    static class Order implements Comparable<Order> {
        int count;
        int value;
        
        public Order(int count, int value) {
            this.count = count;
            this.value = value;
        }
        
        public int compareTo(Order another) {
            return another.value - value;
        }
    }
}