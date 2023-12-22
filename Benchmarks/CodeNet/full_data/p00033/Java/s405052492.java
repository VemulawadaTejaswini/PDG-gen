import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            int btop = 0;
            int ctop = 0;
            boolean yes = true;
            for (int j = 0; j < 10; j++) {
                int n = scanner.nextInt();
                if (n > btop) {
                    btop = n;
                } else if (n > ctop) {
                    ctop = n;
                } else {
                    yes = false;
                }
            }
            System.out.println(yes ? "YES" : "NO");
        }
    }

    public static void main(String... args) {
        solve();
    }
}