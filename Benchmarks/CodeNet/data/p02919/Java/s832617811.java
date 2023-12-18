import java.util.Scanner;
import java.util.stream.IntStream;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < P.length; i++) {
            P[i] = sc.nextInt();
        }
        int sum = 0;
        for (int l = 0; l < N - 1; l++) {
            for (int r = l; r < N; r++) {
                sum += -IntStream.rangeClosed(l, r).map(i -> -P[i]).sorted().skip(1).findFirst().orElse(0);
            }
        }
        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}