import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static boolean isRightTriangle(int a, int b, int c) {
        return a * a + b * b == c * c;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            int[] triangle = new int[3];
            for (int i = 0; i < 3; i++) {
                triangle[i] = scanner.nextInt();
            }
            Arrays.sort(triangle);
            if (isRightTriangle(triangle[0], triangle[1], triangle[2])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}