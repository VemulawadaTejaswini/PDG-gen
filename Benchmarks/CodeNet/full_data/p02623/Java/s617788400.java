import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> b = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(sc.next()));
        }
        int ans = 0;
        while (k > 0) {
            int tempA;
            int tempB;
            if (a.isEmpty() && b.isEmpty()) {
                break;
            }
            if (a.isEmpty()) {
                tempA = Integer.MAX_VALUE;
            } else {
                tempA = a.peek();
            }
            if (b.isEmpty()) {
                tempB = Integer.MAX_VALUE;
            } else {
                tempB = b.peek();
            }
            if (tempA >= tempB) {
                if (k < tempB) {
                    break;
                }
                k -= b.pollFirst();
            } else {
                if (k < tempA) {
                    break;
                }
                k -= a.pollFirst();
            }
            ans++;
        }
        System.out.println(ans);
    }
}