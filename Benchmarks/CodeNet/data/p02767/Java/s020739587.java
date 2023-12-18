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
        int[] X = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            sum += X[i];
        }

        int min = Integer.MAX_VALUE;
        for (int P = 1; P <= 100; P++) {
            int cnd = 0;
            for (int i = 0; i < N; i++) {
                cnd += (X[i] - P) * (X[i] - P);
            }
            min = Math.min(min, cnd);
        }

        System.out.println(min);
        return;
    }

}