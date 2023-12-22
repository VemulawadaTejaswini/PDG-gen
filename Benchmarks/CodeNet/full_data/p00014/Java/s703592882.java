import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int d = scanner.nextInt();
            int result = 0;
            for (int i = 1; i < 600 / d; i++) {
                result += d * d * i * d * i;
            }
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}