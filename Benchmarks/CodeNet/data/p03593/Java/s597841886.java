import java.util.Scanner;

class Solver {
    public void Solve() {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int map[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                map[i][j] = s.charAt(j) - 'a';
            }
        }
        for (int i = 0; i < h; i++) {
            int cnt[] = new int[50];
            for (int j = 0; j < w; j++) {
                cnt[map[i][j]]++;
            }
            int odd = 0;
            for (int j = 0; j < 50; j++) {
                if (cnt[j] % 2 == 1) {
                    odd++;
                }
                if (odd > 1) {
                    System.out.println("No");
                    return;
                }
            }
        }
        for (int i = 0; i < w; i++) {
            int cnt[] = new int[50];
            for (int j = 0; j < h; j++) {
                cnt[map[j][i]]++;
            }
            int odd = 0;
            for (int j = 0; j < 50; j++) {
                if (cnt[j] % 2 == 1) {
                    odd++;
                }
                if (odd > 1) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
