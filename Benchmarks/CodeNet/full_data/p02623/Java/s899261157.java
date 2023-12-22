import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int ans = 0;
        int i = 0;
        int j = 0;
        while (K > 0) {
            if (i < N && j < M) {
                if (Math.min(A[i],B[j]) <= K) {
                    ans++;
                    K -= Math.min(A[i],B[j]);
                    if (A[i] > B[j]) {
                        j++;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            } else if (i < N) {
                if (A[i] <= K) {
                    ans++;
                    K -= A[i];
                    i++;
                } else {
                    break;
                }
            } else if (j < M) {
                if (B[j] <= K) {
                    ans++;
                    K -= B[j];
                    j++;
                }
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}
