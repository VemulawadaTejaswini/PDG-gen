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
        int K = sc.nextInt();

        int[] A = new int[N];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] == 1) idx = i;
        }

        int nr = N - 1 - idx;
        int nl = idx;

        System.out.println(((nr + K - 2) / (K - 1) + (nl + K - 2) / (K - 1)));
        return;
    }

}