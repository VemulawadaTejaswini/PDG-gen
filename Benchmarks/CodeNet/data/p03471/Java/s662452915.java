import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int Y = stdin.nextInt();

        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N - x; y++) {
                int z = N - x - y;
                if (10000 * x + 5000 * y + 1000 * z == Y) {
                    System.out.printf("%d %d %d", x, y, z);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}
