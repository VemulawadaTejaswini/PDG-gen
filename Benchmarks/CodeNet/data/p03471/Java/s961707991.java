import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int Y = scanner.nextInt() / 1000;
        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N; y++) {
                if (x + y > N) continue;
                int z = N - x - y;
                if (10 * x + 5 * y + z == Y) {
                    System.out.printf("%d %d %d\n", x, y, z);
                    return;
                }
            }
        }
        System.out.printf("%d %d %d\n", -1, -1, -1);
    }
}