import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N+1];
        long[] B = new long[M+1];
        A[0] = 0;
        B[0] = 0;
        for (int i=1; i<=N; i++) {
            A[i] = A[i-1] + sc.nextInt();
        }
        for (int i=1; i<=M; i++) {
            B[i] = B[i-1] + sc.nextInt();
        }
        int j = M;
        int count = 0;
        for (int i=0; i<=N; i++) {
            if (A[i]>K) {
                break;
            }
            while (B[j]+A[i]>K) {
                j--;
            }
            count = Math.max(count, i+j);
        }
        System.out.println(count);
    }
}