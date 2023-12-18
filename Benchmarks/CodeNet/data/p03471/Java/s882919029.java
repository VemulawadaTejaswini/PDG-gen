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
        for (i = n; i >= 0 && !flg; i--) {
            int sum = 10 * i;
            for (j = n - i; j >= 0 && !flg; j--) {
                sum += 5 * j;
                for (k = n - (i + j); k >= 0; k--) {
                    sum += k;
                    if (sum == y) {
                        flg = true;
                        break;
                    }
                    sum -= k;
                }
                sum -= 5 * j;
            }
        }
        if (!flg) {
            i = j = k = -1;
        }
        else {
            i++; j++;
        }
        System.out.printf("%d %d %d\n", i, j, k);
    }
}
