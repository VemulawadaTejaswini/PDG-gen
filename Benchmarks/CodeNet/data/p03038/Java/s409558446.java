import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        PriorityQueue<Long> a = new PriorityQueue<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(sc.next());
            a.add(x);
            sum += x;
        }
        for (int i = 0; i < m; i++) {
            long u = Long.parseLong(sc.next());
            long v = Long.parseLong(sc.next());
            for (int j = 0; j < u; j++) {
                if (a.peek() < v) {
                    a.add(v);
                    sum -= a.poll();
                    sum += v;
                } else {
                    break;
                }
            }
        }
        sc.close();
        System.out.println(sum);
    }
}