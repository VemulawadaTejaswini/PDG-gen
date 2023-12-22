import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int result = 2;
            for (int i = 1; i < n; i++) {
                result += i + 1;
            }
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}