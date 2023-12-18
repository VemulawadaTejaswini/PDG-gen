import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            sum += B[i];
        }
        sc.close();
        int[] C = new int[sum];
        sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < B[i]; j++) {
                C[sum] = A[i];
                sum++;
            }
        }
        Arrays.sort(C);
        long ans = 0;
        for (int i = 0; i < M; i++) {
            ans += C[i];
        }
        System.out.println(ans);

    }
}