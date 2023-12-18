import java.util.Scanner;

public class Main {
//    private static final int MOD = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//             while (true)// MAKE SURE TO REMOVE THIS
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt(), A = in.nextInt(), B = in.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = in.nextInt();
        }
        long H = 0;
        for (int i = 0; i < N - 1; i++) {
            int D = X[i + 1] - X[i];
            long HA = D * A;
            H += Math.min(HA, B);
        }
        System.out.println(H);
    }
}