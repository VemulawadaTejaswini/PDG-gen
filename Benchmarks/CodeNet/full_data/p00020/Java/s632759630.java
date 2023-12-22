import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        for (char c: scanner.nextLine().toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }

    public static void main(String... args) {
        solve();
    }
}