import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) queue.add(sc.nextLong());

        while (!queue.isEmpty()) {
            long l = queue.poll();
            Long removeV = null;
            for (long o : queue) {
                long x = l + o;
                if((x & (x-1))==0) {//べき乗なら
                    removeV = o;
                    ans++;
                    break;
                }
            }
            if(removeV!=null) queue.remove(removeV);
        }
        System.out.println(ans);
    }
}