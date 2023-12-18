import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        int[] B = new int[m], C = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        System.out.println(sln(n, m, A, B, C));
    }

    public static int sln(int n, int m, int[] A, int[] B, int[] C) {
        for (int i = 0; i < m; i++) {
            Arrays.sort(A);
            int k = B[i], v = C[i];
            for (int j = 0; j < k; j++) {
                if (A[j] < v) A[j] = v;
                else break;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) sum += A[i];
        return sum;
    }
}
