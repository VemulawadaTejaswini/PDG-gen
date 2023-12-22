import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }

    public static void main(String... args) {
        solve();
    }
}