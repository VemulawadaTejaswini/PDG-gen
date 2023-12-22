import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int maxA = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            maxA = Math.max(maxA, A[i]);
        }

        int ng = 0;
        int ok = maxA;
        while (ng + 1 < ok) {
            int m = (ok+ng)/2;
            int c = 0;
            for (int i = 0; i < N; i++) {
                c += (A[i]+m-1)/m - 1;
            }
            if (c <= K) {
                ok = m;
            } else {
                ng = m;
            }
        }
        System.out.println(ok);
    }
}
