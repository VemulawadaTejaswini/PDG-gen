import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] grid = new char[h][w];
        for (int i = 0; i < h; i++) {
            String next = sc.next();
            for (int j = 0; j < next.length(); j++) {
                char c = next.charAt(j);
                grid[i][j] = c;
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ('.' != grid[i][j]) {
                    continue;
                }
                int count = count(grid, h, w, i, j);
                //System.out.println(count);
                grid[i][j] = (char) (count + '0');
            }
            System.out.println(new String(grid[i]));
        }
    }

    int count(char[][] grid, int h, int w, int i, int j) {
        int sum = 0;
        // upper left
        if (i - 1 >= 0 && j - 1 >= 0 && grid[i - 1][j - 1] == '#') {
            sum++;
        }
        // upper
        if (i - 1 >= 0 && grid[i - 1][j] == '#') {
            sum++;
        }
        // upper right
        if (i - 1 >= 0 && j + 1 <= w - 1 && grid[i - 1][j + 1] == '#') {
            sum++;
        }
        // left
        if (j - 1 >= 0 && grid[i][j - 1] == '#') {
            sum++;
        }
        // right
        if (j + 1 <= w - 1 && grid[i][j + 1] == '#') {
            sum++;
        }
        // lower left
        if (i + 1 <= h - 1 && j - 1 >= 0 && grid[i + 1][j - 1] == '#') {
            sum++;
        }
        // lower
        if (i + 1 <= h - 1 && grid[i + 1][j] == '#') {
            sum++;
        }
        // lower right
        if (i + 1 <= h - 1 && j + 1 <= w - 1 && grid[i + 1][j + 1] == '#') {
            sum++;
        }
        return sum;
    }
}
