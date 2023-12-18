import java.util.Scanner;

public class Main {
    int n, m, k;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
    }

    private void solve() {
        boolean flg = false;
        for (int col = 0; col <= n; col++) {
            for (int row = 0; row <= m; row++) {
                int count = col * m + row * n;
                count -= col * row * 2;
                if (count == k) {
                    flg = true;
                }
            }
        }

        if (flg)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
