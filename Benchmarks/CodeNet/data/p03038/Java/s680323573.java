import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oper = sc.nextInt();

        PriorityQueue<Long> minHeap = new PriorityQueue<>(n);
        for(int i = 0; i < n; i++)
            minHeap.offer(sc.nextLong());

        for(int i = 0; i < oper; i++) {
           int times = sc.nextInt();
           long value = sc.nextLong();
           while(times > 0 && !minHeap.isEmpty() && minHeap.peek() < value) {
                minHeap.poll();
                minHeap.offer(value);
                times--;
           }
        }
        long sum = 0;
        while(!minHeap.isEmpty())
            sum += minHeap.poll();
        System.out.println(sum);
    }

}