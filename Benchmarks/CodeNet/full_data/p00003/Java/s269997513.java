import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        while (N-- > 0) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            int A = a * a, B = b * b, C = c * c;
            boolean isRight;
            if (A > B && A > C) {
                isRight = A == B + C;
            } else if (B > A && B > C) {
                isRight = B == A + C;
            } else {
                isRight = C == A + B;
            }
            System.out.println(isRight ? "YES" : "NO");
        }
    }
}