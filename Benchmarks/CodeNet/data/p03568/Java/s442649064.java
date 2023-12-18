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
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long cnt = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                // even
                cnt *= 2;
            } else {
                // odd
                cnt *= 1;
            }
        }
        System.out.println((int)Math.pow(3, N) - cnt);

        return;
    }

}