import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int X = sc.nextInt();
        final int Y = sc.nextInt();

        if (A + B < C * 2) {
            System.out.println(A*X + B*Y);
        } else {
            final int MAX = Math.max(X, Y);
            final int MIN = Math.min(X, Y);
            final int DIF = MAX - MIN;
            int ans = C * 2 * MIN;

            final int Z = C * 2 * DIF;
            if (X > Y && A * DIF < Z) ans += A * DIF;
            if (X > Y && A * DIF > Z) ans += Z;
            if (X < Y && B * DIF < Z) ans += B * DIF;
            if (X < Y && B * DIF > Z) ans += Z;
            System.out.println(ans);
        }
    }
}
