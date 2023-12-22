import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        int[] B = new int[n];
        countingSort(A, B, 10000);

        StringBuilder sb = new StringBuilder("");
        sb.append(B[0]);
        for (int i = 1; i < B.length; i++) {
            sb.append(" ").append(B[i]);
        }
        System.out.println(sb.toString());
    }

    public static int[] countingSort(int[] A, int[] B, int k) {
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