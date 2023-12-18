import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main instance = new Main();
        instance.solve();
    }

    private void solve() {
        try {
            int n = sc.nextInt();
            int y = sc.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;

            int x = y - 10000 * a + 5000 * b + 1000 * c;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int k = n - i - j;
                    if (k <= 0) {
                        continue;
                    }
                    if (i * 10000 + j * 5000 + 1000 * (n - i - j) == y) {
                        System.out.println(i + " " + j + " " + (n - i - j));
                        return;
                    }
                }
            }
            System.out.println("-1 -1 -1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}