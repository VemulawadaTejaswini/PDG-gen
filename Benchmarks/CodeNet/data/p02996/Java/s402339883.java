import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Work> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Work(sc.nextInt(), sc.nextInt()));
        }
        int cur = 0;
        while (queue.size() > 0) {
            Work w = queue.poll();
            cur += w.cost;
            if (cur > w.time) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    
    static class Work implements Comparable<Work> {
        int cost;
        int time;
        
        public Work(int cost, int time) {
            this.cost = cost;
            this.time = time;
        }
        
        public int compareTo(Work another) {
            return time - another.time;
        }
    }
}