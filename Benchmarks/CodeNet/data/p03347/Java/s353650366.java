import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        int ans = 0;
        int before = -1;
        for (int i=N-1;i>=0;i--) {
            if (A[i]>i) {
                System.out.println(-1);
                return;
            }
            if (A[i]!=0 && A[i]!=before-1) {
                ans += A[i];
            }
            before = A[i];
        }
        System.out.println(ans);
    }
}