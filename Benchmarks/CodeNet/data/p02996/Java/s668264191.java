import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static class Pair {
        int left;
        int right;

        Pair(int l, int r) {
            left = l;
            right = r;
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] as = new int[n];
        int[] bs = new int[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.right - o2.right;
            }
        });
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
            bs[i] = std.nextInt();
            pq.add(new Pair(as[i], bs[i]));
        }

        long current = 0;
        boolean ans = true;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            current += p.left;
            if (current > p.right) {
                ans = false;
                break;
            }
        }

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
