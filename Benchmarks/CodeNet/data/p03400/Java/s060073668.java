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
        int D = sc.nextInt();
        int X = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        // consume array O(N * D)
        int[] C = new int[D + 1];
        for (int i = 1; i <= D; i++) {
            for (int j = 0; j < N; j++) {
                if ((i - 1) % A[j] == 0) {
                    C[i]++;
                }
            }
        }

        // start time-based simulation.
        long sum = X;
        for (int i = 1; i <= D; i++) {
            sum += C[i];
        }

        System.out.println(sum);

        return;
    }

}