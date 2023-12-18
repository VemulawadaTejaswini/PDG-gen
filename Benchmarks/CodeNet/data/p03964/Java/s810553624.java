import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        int N = in.nextInt();
        int[] T = new int[N];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = in.nextInt();
            A[i] = in.nextInt();
        }

        int t = T[0];
        int a = A[0];
        for (int i = 1; i < N; i++) {
            int ans = t + a;
            int Ti = T[i];
            int Ai = A[i];
            while (Ti < t || Ai < a) {
                Ti += T[i];
                Ai += A[i];
            }
            int sum = Ti + Ai;

            int diff = 0;
            while ((ans + diff) % sum > 0) {
                diff++;
            }
            t = (ans + diff) * T[i] / (T[i] + A[i]);
            a = (ans + diff) * A[i] / (T[i] + A[i]);
        }
        System.out.println(t + a);
    }
}