import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] pre = new int[N];
        while (K-- > 0) {
            for (int i = 0; i < N; i++) {
                pre[i] = 0;
            }
            for (int i = 0; i < N; i++) {
                int d = A[i];
                pre[Math.max(i-d,0)]++;
                if (i+d+1 < N) {
                    pre[i+d+1]--;
                }
            }
            boolean allN = true;
            int now = 0;
            for (int i = 0; i < N; i++) {
                now += pre[i];
                A[i] = now;
                if (A[i] != N) {
                    allN = false;
                }
            }
            if (allN) {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            ans.append(A[i]).append(' ');
        }

        System.out.println(ans.toString());
    }
}
