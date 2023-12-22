import java.util.Scanner;

public class Main {
    public static int[] CountingSort(int[] A, int k) {
        int n = A.length;
        int[] B = new int[n];
        int[] C = new int[k];
        for (int i = 0; i < n; i++) {
            C[A[i]]++;
        }
        for (int i = 1; i < k; i++) {
            C[i] += C[i - 1];
        }
        for (int j = n - 1; j >= 0; j--) {
            B[C[A[j]] - 1] = A[j];
            C[A[j]]--;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] A = new int[k];
        for (int i = 0; i < k; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = CountingSort(A, 10001);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) {
            ans.append(B[i]);
            if (i == k - 1) {
                ans.append("\n");
            } else {
                ans.append(" ");
            }
        }
        System.out.print(ans);
        sc.close();
    }
}