import java.util.Scanner;

public class Main {
    int n;
    int y;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        y = (int) (sc.nextLong() / 1000);
    }

    private void solve() {
        boolean flg = false;
        int i, j, k;
        i = j = k = 0;
        for (i = n; i >= 0; i--) {
            int sum = 10 * i;
            for (j = n - i; j >= 0; j--) {
                k = n - (i + j);
                sum += 5 * j + k;
                if (y == sum) {
                    flg = true;
                    break;
                }
                sum -= 5 * j + k;
            }
            if(flg)
                break;
        }
        if (!flg) {
            i = j = k = -1;
        }
        System.out.printf("%d %d %d\n", i, j, k);
    }
}
