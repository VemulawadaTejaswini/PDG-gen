import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N * 3];
        for (int i = 0; i < N * 3; ++i) {
            A[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(A);
        long ans = 0;
        for (int i = N * 3 - 2; i >= N; i -= 2) {
                ans += A[i];
            }

        System.out.println(ans);
    }
}