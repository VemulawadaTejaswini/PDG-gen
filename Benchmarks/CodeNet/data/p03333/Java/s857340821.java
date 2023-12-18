import java.util.*;
public class Main {
    public static int L[], R[];
    public static long A[], B[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        L = new int[N];
        R = new int[N];
        for (int i = 0; i < N; ++i) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(L);
        for (int i = 0; 2*i < N-1; ++i) {
            L[i] += L[N-i-1];
            L[N-i-1] = L[i]-L[N-i-1];
            L[i] -= L[N-i-1];
        }
        Arrays.sort(R);

        A = new long[N+1];
        B = new long[N+1];
        long ans = 0;
        for (int i = 0; i < N; ++i) {
            A[i+1] = L[i]+A[i];
            B[i+1] = R[i]+B[i];
        }
        for (int i = 0; i < N; ++i) {
            ans = Math.max(A[i]-B[i+1], ans);
            ans = Math.max(A[i+1]-B[i], ans);
            ans = Math.max(A[i+1]-B[i+1], ans);
        }
        System.out.println(2*ans);
    }
}