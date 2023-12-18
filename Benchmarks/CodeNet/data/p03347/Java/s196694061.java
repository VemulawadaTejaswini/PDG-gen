import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long ans = 0;
        int now = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 && A[i] != 0) {
                System.out.println(-1);
                return;
            }
            if (A[i] == now+1) {
                ans++;
                now++;
            } else if (A[i] <= now) {
                ans += A[i];
                now = A[i];
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}
