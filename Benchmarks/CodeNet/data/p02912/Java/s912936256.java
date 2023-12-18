import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pQueue.add(sc.nextInt());
        }

        int tmp;
        for (int i = 0; i < M; i++) {
            tmp = (int) pQueue.poll() / 2;
            pQueue.add(tmp);
        }

        int all = 0;
        for (int i = 0; i < N; i++) {
            all += (int) pQueue.poll();
        }

        System.out.println(all);
        
    }
}