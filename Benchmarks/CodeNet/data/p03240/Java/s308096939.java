import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        // i,j を中心とする
        int H = 0; // 最終的な答え

        sc.close();
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                H = h[0] + Math.abs(i - x[0]) + Math.abs(j - y[0]);
                boolean ok = true;
                for (int k = 0; k < n; k++) {
                    if (H - Math.abs(i - x[k]) - Math.abs(j - y[k]) != h[k]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    System.out.println(i + " " + j + " " + H);
                    return;
                }
            }
        }
    }
}
