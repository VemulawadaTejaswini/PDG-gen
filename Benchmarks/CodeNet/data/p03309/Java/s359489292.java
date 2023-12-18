import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 1; i <= N; i++) {
            A[i-1] = sc.nextInt() - i;
        }

        Arrays.sort(A);

        int b;
        if (N % 2 == 0) {
            b = Math.round((A[N/2] + A[N/2 - 1]) / 2);
        } else {
            b = A[(N - 1) / 2];
        }

        int ret = 0;
        for (int i = 0; i < N; i++) {
            ret += Math.abs(A[i] - b);
        }

        System.out.println(ret);
    }
}