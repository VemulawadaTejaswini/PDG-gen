import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, K, A));
    }

    private static int solve(int N, int K, int[] A) {
        int count = 0;
        int minIdx = -1, maxIdx = -1;

        for(int i=0; i<N; i++) {
            if(A[i] == 1) {
                minIdx = i;
                maxIdx = i;
                break;
            }
        }

        while (minIdx != 0) {
            if (minIdx <= K-1) {
                minIdx = 0;
                maxIdx = Math.max(maxIdx, K-1);
            } else {
                minIdx -= K-1;
            }
            count++;
        }
        while (maxIdx != A.length-1) {
            if (A.length-1 - maxIdx <= K-1) {
                maxIdx = A.length-1;
            } else {
                maxIdx += K-1;
            }
            count++;
        }

        return count;
    }
}