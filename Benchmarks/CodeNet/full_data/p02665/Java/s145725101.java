import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N+1];
        for (int i=0; i<N+1; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, A));
    }

    private static long solve2(int N, int[] A) {
        int[] maxNode = new int[N+1];
        maxNode[0] = 1;
        for (int i=1; i<N+1; i++) {
            maxNode[i] = (maxNode[i-1]-A[i-1])*2;

            // System.err.println("check i=" + i + ", max=" + maxNode[i]);
            if (maxNode[i] < 0) return -1;
        }


        long count = A[N];
        int childNode = A[N];
        // System.err.println("i=" + N + ", count=" + count + ", max=" + maxNode[N] + ", leaf=" + A[N] + ", child=" + childNode);
        for (int i=N-1; i>=0; i--) {
            int minNode = A[i+1]/2 + A[i+1]%2;
            if (maxNode[i] < A[i] + minNode) {
                return -1;
            }

            count += A[i];
            count += Math.min(maxNode[i]-A[i], childNode);
            childNode = Math.min(maxNode[i]-A[i], childNode) + A[i];

            // System.err.println("i=" + i + ", count=" + count + ", max=" + maxNode[i] + ", leaf=" + A[i] + ", child=" + childNode);
        }

        return count;
    }
}