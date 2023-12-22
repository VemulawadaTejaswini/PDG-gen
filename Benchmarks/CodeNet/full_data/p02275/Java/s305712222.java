import java.util.Scanner;

class Main {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            if (A[i] > max) {
                max = A[i];
            }
        }

        int[] B = countingSort(A, max);

        StringBuilder sb = new StringBuilder("");
        sb.append(B[0]);
        for (int i = 1; i < B.length; i++) {
            sb.append(" ").append(B[i]);
        }
        System.out.println(sb);
    }

    public static int[] countingSort(int[] A, int k) {
        int[] B = new int[A.length];
        int[] C = new int[k + 1];
        int i;
        for (i = 0; i < A.length; i++) {
            C[A[i]]++;
        }
        for (i = 1; i <= k; i++) {
            C[i] += C[i - 1];
        }
        for (i = A.length - 1; i >= 0; i--) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }
        return B;
    }
}
