import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for (int i = 0 ; i < n; i++) {
            pq.add(sc.nextInt());
        }

//        debug(pq);

        for (int i = 0; i < m; i++) {
            int top = pq.remove();
            pq.add(top / 2);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += pq.remove();
        }

        System.out.println(ans);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
