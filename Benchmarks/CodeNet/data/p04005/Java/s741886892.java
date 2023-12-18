import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
        long AB = (C / 2 > 0) ? (long) A * B : 0;
        long BC = (A / 2 > 0) ? (long) B * C : 0;
        long CA = (B / 2 > 0) ? (long) C * A : 0;
        long ans = Math.min(AB, Math.min(BC, CA));
        System.out.println(ans);
    }
}