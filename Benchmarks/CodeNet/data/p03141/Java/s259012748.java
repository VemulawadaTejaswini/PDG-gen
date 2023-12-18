import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        PriorityQueue<Point> que = new PriorityQueue<>((k, l) -> l.y - k.y);

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            que.add(new Point(i, a[i] + b[i]));
        }

        boolean t = true;

        long ts = 0;
        long as = 0;

        while (!que.isEmpty()) {
            if (t) {
                ts += a[que.poll().x];
            } else {
                as += b[que.poll().x];
            }
            t = !t;
        }

        System.out.println(ts - as);
    }
}