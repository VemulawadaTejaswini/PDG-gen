import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            int math = scanner.nextInt();
            int algorithm = scanner.nextInt();
            int impl = scanner.nextInt();
            math += scanner.nextInt();
            algorithm += scanner.nextInt();
            impl += scanner.nextInt();
            if (math + algorithm + impl == 0) {
                break;
            }
            int maximum = math / 3 + algorithm / 3 + impl / 3;
            maximum += Math.min(Math.min(math % 3, algorithm % 3), impl % 3);
            if (math % 3 == 2 && algorithm % 3 == 2 && impl % 3 == 0 && impl > 0 ||
                algorithm % 3 == 2 && impl % 3 == 2 && math % 3 == 0 && math > 0 ||
                impl % 3 == 2 && math % 3 == 2 && algorithm % 3 == 0 && algorithm > 0) {
                maximum++;
            }
            System.out.println(maximum);
        }
    }

    public static void main(String... args) {
        solve();
    }
}