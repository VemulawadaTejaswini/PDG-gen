import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][n];

        for (int i = 0; i < m; i++) {
            int t1 = in.nextInt() - 1;
            int t2 = in.nextInt() - 1;
            a[t1][t2] = 1;
            a[t2][t1] = 1;
        }
        List<Integer> order = new ArrayList<>();
        order.add(0);
        List<Integer> remain = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            remain.add(i);
        }
        System.out.println(f(order, remain, a));
    }

    static int f(List<Integer> order, List<Integer> remain, int edges[][]) {
        if (remain.size() == 0) {
            int cur = order.get(0);
            int next;
            for (int p = 1; p < order.size(); p++) {
                next = order.get(p);
                if (edges[cur][next] == 1 || edges[next][cur] == 1) {
                    cur = next; 
                } else {
                    return 0;
                }
            }
            return 1;
        }

        int total = 0;
        for (int p = 0; p < remain.size(); p++) {
            order.add(remain.get(p));
            remain.remove(p);
            total += f(order, remain, edges);
            remain.add(p, order.get(order.size() - 1));
            order.remove(order.size() - 1);
        }
        return total;
    }
}