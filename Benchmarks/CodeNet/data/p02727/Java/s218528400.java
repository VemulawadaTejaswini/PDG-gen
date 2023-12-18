
import java.util.*;

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deliciousness = 0;
        int targetRed = sc.nextInt();
        int targetGreen = sc.nextInt();
        int totalRed = sc.nextInt();
        int totalGreen = sc.nextInt();
        int totalColorless = sc.nextInt();
        PriorityQueue<Integer> redpq = new PriorityQueue<>();
        PriorityQueue<Integer> greenpq = new PriorityQueue<>();
        PriorityQueue<Integer> colorlesspq = new PriorityQueue<>();

        for (int i=0;i<totalRed;i++){
            redpq.add(sc.nextInt());
        }
        for (int i=0;i<totalGreen;i++){
            greenpq.add(sc.nextInt());
        }
        for (int i=0;i<totalColorless;i++){
            colorlesspq.add(sc.nextInt());
        }
        while (redpq.size() > targetRed) {
            redpq.poll();
        }
        while (greenpq.size() > targetGreen) {
            greenpq.poll();
        }

        while (!colorlesspq.isEmpty()) {
            int top = colorlesspq.poll();
            int redTop = redpq.peek();
            int greenTop = greenpq.peek();
            if (top > redTop || top > greenTop) {
                if (top - redTop > top - greenTop) {
                    redpq.poll();
                    redpq.add(top);
                } else {
                    greenpq.poll();
                    greenpq.add(top);
                }
            }
        }

        while(!greenpq.isEmpty()) {
            deliciousness += greenpq.poll();
        }
        while(!redpq.isEmpty()) {
            deliciousness += redpq.poll();
        }
        System.out.println(deliciousness);
    }
}
