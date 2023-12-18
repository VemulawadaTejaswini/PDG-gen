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

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    int k = n - i - j;
                    if (k < 0) {
                        continue;
                    }
                    if (i * 10000 + j * 5000 + 1000 * k == y) {
                        System.out.println(i + " " + j + " " + k);
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