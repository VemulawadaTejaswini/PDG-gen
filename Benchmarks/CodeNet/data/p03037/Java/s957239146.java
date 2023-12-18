import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        for (int i=0; i<M; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, L, R));
    }

    public static int solve(int N, int M, int[] L, int[] R) {
        int ansL = 1, ansR = N;

        for (int i=0; i<M; i++) {
            if (ansL < L[i]) {
                ansL = L[i];
            }
            if (ansR > R[i]) {
                ansR = R[i];
            }
        }


        if (ansR < ansL) return 0;

        return ansR-ansL+1;
    }
}