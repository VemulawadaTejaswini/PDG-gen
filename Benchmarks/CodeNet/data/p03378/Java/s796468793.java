import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[M];
        for (int i=0; i<M; i++) {
            a[i] = sc.nextInt();
        }

        int ans = solve(N, M, X, a);
        System.out.println(ans);
    }

    private static int solve(int N, int M, int X, int[] a) {
        int[] score = new int[2];

        int idx = 0;
        for (int i=0; i<M; i++) {
            if (a[i] > X) {
                idx = 1;
            }

            score[idx]++;
        }

        return Math.min(score[0], score[1]);
    }
}
