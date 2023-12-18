import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static final void main(String[] args) {
        Main m = new Main();
        m.init();
        m.solve();
    }

    // ========================================================================= //
    char[][] f;
    int h, w;

    public void init() {
        h = sc.nextInt();
        w = sc.nextInt();
        f = new char[h][];
        for (int i = 0; i < h; i++) {
            f[i] = sc.next().toCharArray();
        }
    }

    public void solve() {
        char[][] res = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (f[i][j] == '#') {
                    res[i][j] = '#';
                    continue;
                }

                int n = 0;
                for (int y = i - 1; y <= i + 1; y++) {
                    for (int x = j - 1; x <= j + 1; x++) {
                        if (y >= 0 && y < h && x >= 0 && x < w) {
                            if (f[y][x] == '#') {
                                n++;
                            }
                        }
                    }
                }
                res[i][j] = (char)(n + '0');
            }
        }

        for (int i = 0; i < h; i++) {
            System.out.println(String.valueOf(res[i]));
        }
    }
}
