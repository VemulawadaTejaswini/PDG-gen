import java.util.*;

public class Main {

    static class Node {
        long x, y;
        Node (long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        long mod = 1000000007;
        Node[] a = new Node[n];
        for (int i = 0; i < n; i++) {
            long x = scan.nextLong();
            long y = scan.nextLong();
            a[i] = new Node(x, y);
        }
        Arrays.sort(a, (e1, e2) -> (int) (e1.x == e2.x ? e1.y - e2.y : e1.x - e2.x));
        long ans = 0;
        long m1 = -a[0].x - a[0].y;
        long m2 = -a[0].x + a[0].y;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, a[i].x + a[i].y + m1);
            ans = Math.max(ans, a[i].x - a[i].y + m2);
            m1 = Math.max(m1, -a[i].x - a[i].y);
            m2 = Math.max(m2, -a[i].x + a[i].y);
        }
        System.out.println(ans);
    }
}
