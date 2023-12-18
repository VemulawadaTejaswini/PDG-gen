import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Cだけ
        long priceOnlyC = Math.max(X, Y) * 2 * C;

        // C + 残り A or B
        long priceCwithAB = Math.min(X, Y) * 2 * C;
        if (X > Y) {
            int xTmp = X - Y;
            priceCwithAB += xTmp * A;
        } else {
            int yTmp = Y - X;
            priceCwithAB += yTmp * B;
        }

        // C使わない
        long priceOnlyAB = A * X + B * Y;

        out.println(Math.min(priceOnlyC, Math.min(priceCwithAB, priceOnlyAB)));
    }
}