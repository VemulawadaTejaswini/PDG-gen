import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        sc.close();

        long m = 0;
        long ans = 0;
        Arrays.sort(A);
        for (int i = N - 1; m < M && -1 < i; i--) {
            ans += A[i] * 2;
            if (M <= ++m) break;
            for (int j = i - 1; -1 < j; j--) {
                ans += (A[i] + A[j]);
                if (M <= ++m) break;
                ans += (A[i] + A[j]);
                if (M <= ++m) break;
            }
        }
        System.out.println(ans);
    }
}