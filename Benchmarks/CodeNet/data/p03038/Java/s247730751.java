import java.awt.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i< n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        PriorityQueue<Point> queue = new PriorityQueue<>((a1, b1) -> b1.y - a1.y);

        for (int i = 0; i< m; i++) {
            queue.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        int ind = 0;
        while (!queue.isEmpty()) {
            Point now = queue.poll();
            int limit = ind + now.x < a.length ? ind + now.x : a.length;
            for (;ind < limit; ind++) {
                a[ind] = a[ind] < now.y ? now.y : a[ind];
            }
        }

        System.out.println(Arrays.stream(a).sum());
    }
}
