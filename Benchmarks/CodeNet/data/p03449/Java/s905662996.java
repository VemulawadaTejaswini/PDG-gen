import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[2][N];

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < N; i++) {
                A[k][i] = sc.nextInt();
            }
        }

        int sum = A[0][0];
        for (int i = 0; i < N; i++) {
            sum += A[1][i];
        }

        int max = sum;
        for (int i = 1; i < N; i++) {
            sum -= A[1][i - 1];
            sum += A[0][i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
        return;
    }

}