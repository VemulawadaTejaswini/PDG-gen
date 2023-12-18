import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceTo(Point other) {
        return Math.abs(x - other.x) + Math.abs(y - other.y);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class Solver {

    private boolean paintable(char[][] s, int H, int W, int i, int j) {
        boolean ok = false;
        if (i - 1 >= 0 && s[i - 1][j] == '#') ok = true;
        if (j - 1 >= 0 && s[i][j - 1] == '#') ok = true;
        if (i + 1 < H  && s[i + 1][j] == '#') ok = true;
        if (j + 1 < W  && s[i][j + 1] == '#') ok = true;

        return ok;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] s = new char[H][];
        for (int i = 0; i < H; i++) {
            s[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (s[i][j] == '#' && !paintable(s, H, W, i, j)) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
        return;
    }

}