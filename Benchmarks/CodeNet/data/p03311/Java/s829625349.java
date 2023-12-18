import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int ans = solve2(N, A);

        System.out.println(ans);
    }

    private static int solve(int N, int[] A) {
        int sad = Integer.MAX_VALUE;

        int minB = A[0]-1, maxB = A[0]-1;
        for (int i=1; i<N; i++) {
            int b = A[i] - (i+1);
            minB = Math.min(minB, b);
            maxB = Math.max(maxB, b);
        }


        for (int b=minB; b<=maxB; b++) {
            sad = Math.min(sad, calcSad(N, A, b));
        }

        return sad;
    }

    private static int solve2(int N, int[] A) {
        int sad = Integer.MAX_VALUE;

        for (int i=0; i<N; i++) {
            int b = A[i] - (i+1);
            sad = Math.min(sad, calcSad(N, A, b));
        }

        return sad;
    }

    private static int calcSad(int N, int[] A, int b) {
        int sad = 0;

        for (int i=0; i<N; i++) {
            sad += Math.abs(A[i] - (b+i+1));
        }

        return sad;
    }
}