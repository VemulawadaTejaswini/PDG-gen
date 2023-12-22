import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        TreeMap<Integer, Integer> M = new TreeMap<>();
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 1; i <= m; i++) {
            M.put(i, 0);
            Q.offer(0);
        }
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            Integer fb = M.floorKey(b + 1);
            if (fb != null) {
                int r = fb.intValue();
                int tem = M.get(r) + b + 1 - r;
                if (b + 1 <= m) {
                    M.put(b + 1, tem);
                    Q.offer(tem);
                }
            }
            while (true) {
                fb = M.floorKey(b);
                if (fb == null) break;
                int x = fb.intValue();
                int v = M.get(x);
                if (x < a) break;
                M.remove(x);
                Q.remove(v);
            }
            System.out.println(Q.size() == 0 ? -1 : Q.peek() + i);
        }
    }
}
