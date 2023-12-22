import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int r = scanner.nextInt();
            final int c = scanner.nextInt();
            if (r == 0 && c == 0) {
                break;
            }
            System.out.println(r * c == 1 ? "no" : "yes");
        }
    }

    public static void main(String... args) {
        solve();
    }
}