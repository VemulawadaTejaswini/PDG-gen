import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int[] weights = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

        while (scanner.hasNextInt()) {
            int weight = scanner.nextInt();
            boolean space = false;
            for (int i = 0; weight > 0; i++) {
                if ((weight & 0x1) == 0x1) {
                    if (space) {
                        System.out.print(" ");
                    }
                    System.out.print(weights[i]);
                    space = true;
                }
                weight >>= 1;
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        solve();
    }
}