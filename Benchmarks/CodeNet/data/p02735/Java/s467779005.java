
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    int[][] s;
    int H;
    int W;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        W = scanner.nextInt();
        s = new int[H][W];

        for (int i = 0; i < H; i++) {
            char[] c = scanner.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if (c[j] == '.') {
                    s[i][j] = 0;
                } else {
                    s[i][j] = -1;
                }
            }
        }
        int index = 1;
        while (!is()) {
            fill(index, 0, 0);
            index++;
        }

        System.out.println(search(H-1, W-1));
    }

    private boolean is() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (s[i][j] == -1) return false;
            }
        }
        return true;
    }

    private void fill(int index, int i, int j) {
        if (s[i][j] == -1) {
            s[i][j] = index;
        } else if (s[i][j] >= 0 && s[i][j] < index) {
            if (i + 1 < H) fill(index, i + 1, j);
            if (j + 1 < W) fill(index, i, j + 1);
        }
    }

    private int search(int i, int j) {
        int tmp = Integer.MAX_VALUE;
        if (s[i][j] > 0) {
            return s[i][j];
        } else if (i == 0 && j == 0) {
            return 0;
        } else if (s[i][j] == 0) {
            if (i - 1 >= 0) tmp = Math.min(tmp, search(i - 1, j));
            if (j - 1 >= 0) tmp = Math.min(tmp, search(i, j - 1));
        }
        return tmp;
    }
}
