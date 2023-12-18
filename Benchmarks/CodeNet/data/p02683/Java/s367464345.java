import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private boolean check(int[] curX , int X) {
        for (int i = 0; i < curX.length; i++) {
            if (curX[i] < X) return false;
        }
        return true;
    }

    private int calc(int N, int M, int X, int[] cost, int[][] A, int pos, int curC, int[] curX) {
        if (pos == N) {
            if (check(curX, X)) return curC;
            else return Integer.MAX_VALUE;
        }

        // skip the book
        int c1 = calc(N, M, X, cost, A, pos + 1, curC, curX);

        // buy the book


        int[] newX = Arrays.copyOf(curX, curX.length);
        for (int i = 0; i < M; i++) {
            newX[i] += A[pos][i];
        }
        int c2 = calc(N, M, X, cost, A, pos + 1, curC + cost[pos], newX);

        return Math.min(c1, c2);
    }


    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[] C = new int[N];
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[] v = new int[M];
        int min = calc(N, M, X, C, A, 0, 0, v);
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
        return;
    }

}