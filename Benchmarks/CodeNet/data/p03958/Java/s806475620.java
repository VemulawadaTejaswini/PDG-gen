import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    Scanner   sc   = new Scanner(System.in);

    @SuppressWarnings("unused")
    void run() {
        int K = sc.nextInt();
        int T = sc.nextInt();
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < T; i++) que.add(sc.nextInt());
        int c = 0;
        while(!que.isEmpty()) {
            if(que.size() == 1) c += que.poll() - 1;
            else {
                int a = que.poll() - 1;
                int b = que.poll() - 1;
                if(a > 0) que.add(a);
                if(b > 0) que.add(b);
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}