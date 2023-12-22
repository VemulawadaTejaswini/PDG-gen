import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        char[][] pattern = new char[8][];
        
        for (int i = 0; i < 8; i++) {
            pattern[i] = scanner.next().toCharArray();
        }

        System.out.println(90);
        for (int j = 0; j < 8; j++) {
            for (int i = 7; i >= 0; i--) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

        System.out.println(180);
        for (int i = 7; i >= 0; i--) {
            for (int j = 7; j >= 0; j--) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

        System.out.println(270);
        for (int j = 7; j >= 0; j--) {
            for (int i = 0; i < 8; i++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String... args) {
        solve();
    }
}