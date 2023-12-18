import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        boolean[] hskip = new boolean[H];
        boolean[] wskip = new boolean[W];
        char[][] a = new char[H][];
        for (int i = 0; i < H; i++) {
            a[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < H; i++) {
            boolean skip = true;
            for (int j = 0; j < W; j++) {
                if (a[i][j] == '#') {
                    skip = false;
                    break;
                }
            }
            if (skip) hskip[i] = true;
        }

        for (int i = 0; i < W; i++) {
            boolean skip = true;
            for (int j = 0; j < H; j++) {
                if (a[j][i] == '#') {
                    skip = false;
                    break;
                }
            }
            if (skip) wskip[i] = true;
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (!wskip[j] && !hskip[i]) {
                    System.out.print(a[i][j]);
                }
            }
            if (!hskip[i]) {
                System.out.println();
            }
        }
        return;
    }

}