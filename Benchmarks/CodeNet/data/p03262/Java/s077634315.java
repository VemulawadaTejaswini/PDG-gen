import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] pos = new int[N];

        for (int i = 0; i < N; i++) {
            pos[i] = scanner.nextInt();
        }
        if (N == 1) {
            System.out.println(Math.max(N, pos[0]) - Math.min(N, pos[0]));
            return;
        }
        int tmpGcd = gcd(dist(X, pos[0]), dist(X, pos[1]));
        for (int i = 2; i < N; i++) {
            tmpGcd = gcd(tmpGcd, dist(X, pos[i]));
        }
        System.out.println(tmpGcd);
    }

    public static int dist(int X, int pos) {
        if (X > pos) {
            return X - pos;
        }
        return pos - X;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}