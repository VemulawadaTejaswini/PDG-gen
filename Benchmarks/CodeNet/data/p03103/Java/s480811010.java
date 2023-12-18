import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Queue<Integer> q = new PriorityQueue<>();
        int[] a = new int[1_000_000_000];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            q.add(temp);
            a[temp - 1] = Integer.parseInt(sc.next());
        }
        long ans = 0;
        for (int i = 0; i < m; i++) {
            int temp = q.peek();
            ans += temp;
            a[temp - 1]--;
            if (a[temp - 1] == 0) {
                q.poll();
            }
        }
        System.out.println(ans);
    }
}
