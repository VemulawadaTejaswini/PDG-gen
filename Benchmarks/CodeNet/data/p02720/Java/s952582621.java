import java.util.*;
public class Main {
    static PriorityQueue<Long> queue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queue = new PriorityQueue<>();
        for(int i = 1; i<10; i++) {
            int depth = 10;
            if(i>=4) depth--;
            queue.add((long)i);
            addRunRun(1 ,i,(long)i, depth);
        }
        for(int i = 0; i<n-1; i++) {
            //System.err.println(queue.peek());
            queue.poll();
        }
        System.out.println(queue.poll());

    }
    public static void addRunRun(int cnt,long total, long i, int depth) {
        if(cnt == depth) return;
        queue.add(total*10+i);
        addRunRun(cnt+1, total*10+i, i, depth);
    
        if(i!=9) {
            queue.add(total*10+i+1);
            addRunRun(cnt+1, total*10+i+1, i+1, depth);
        }
        if(i!=0) {
            queue.add(total*10+i-1);
            addRunRun(cnt+1, total*10+i-1, i-1, depth);
        }
    }
}