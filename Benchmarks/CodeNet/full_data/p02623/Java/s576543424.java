import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Deque<Integer> a = new LinkedList<>();
        Deque<Integer> b = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        long ans = 0;
        while (!a.isEmpty() || !b.isEmpty()) {
            Integer peek1 = a.peek();
            Integer peek2 = b.peek();

            if (peek1 != null && peek2 != null) {
                int min = Math.min(peek1, peek2);
                if (min > k) {
                    break;
                }
                if (peek1 == min) {
                    a.poll();
                } else {
                    b.poll();
                }
                k -= min;
            } else if (peek1 == null) {
                if (peek2 > k) {
                    break;
                }
                b.poll();
                k -= peek2;
            } else {
                if (peek1 > k) {
                    break;
                }
                a.poll();
                k -= peek1;
            }
            ans++;
        }
        System.out.println(ans);
    }
}