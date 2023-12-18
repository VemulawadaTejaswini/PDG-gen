import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Long> a = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }

        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            long c = sc.nextLong();
            for (int j = 0; j < b; j++) {
                if (a.peek() < c) {
                    a.poll();
                    a.add(c);
                } else {
                    break;
                }
            }
        }

        long ans = 0;

        for(Long v : a) {
            ans += v;
        }

        System.out.println(ans);
    }
}
