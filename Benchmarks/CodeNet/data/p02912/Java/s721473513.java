import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue pQueue = new PriorityQueue<Long>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pQueue.add(sc.nextLong());
        }

        long tmp;
        for (int i = 0; i < M; i++) {
            tmp = (long) pQueue.poll() / 2;
            pQueue.add(tmp);
        }

        long all = 0;
        for (int i = 0; i < N; i++) {
            all += (long) pQueue.poll();
        }

        System.out.println(all);
        
    }
}