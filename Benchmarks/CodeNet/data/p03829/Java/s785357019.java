import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int[] X = new int[N];
        for (int i=0;i<N;i++) {
            X[i] = Integer.parseInt(sc.next());
        }
        long[] ruiseki = new long[N+1];
        for (int i=1;i<N;i++) {
            ruiseki[i+1] = ruiseki[i]+Math.min(A*(X[i]-X[i-1]), B);
        }
        long ans = 2_000_000_000_000_000L;
        for (int i=2;i<N;i++) {
            long tmp = ruiseki[i-1] + B + (ruiseki[N]-ruiseki[i+1]) + Math.min(A*(X[i]-X[i-1]), B);
            ans = Math.min(ans, tmp);
        }
        ans = Math.min(ans, ruiseki[N]);
        System.out.println(ans);
    }
}