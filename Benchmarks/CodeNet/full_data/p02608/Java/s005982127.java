import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solve(N);
    }

    private static void solve(int N) {
        int[] count = new int[4 * N + 1];
        final int limit = (int) Math.sqrt(N);
        for (int x = 1; x <= limit; x++) {
            for (int y = 1; y <= limit; y++) {
                for (int z = 1, zlimit = 2 * limit - x -y; z <= zlimit; z++) {
                    count[x * (x + y) + y * (y + z) + z * (z + x)]++;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(count[i]);
        }
    }
}
