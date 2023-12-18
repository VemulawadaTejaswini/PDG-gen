import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        Cell[][] a = new Cell[h + 2][w + 2];
        Queue<Cell> queue = new ArrayDeque<>();
        for (int i = 0; i < w + 2; i++) {
            a[0][i] = new Cell(0, i, '#');
        }
        for (int i = 1; i < h + 1; i++) {
            String line = sc.nextLine().replace("\n", "");
            a[i][0] = new Cell(i, 0, '#');
            for (int j = 1; j < w + 1; j++) {
                a[i][j] = new Cell(i, j, line.charAt(j - 1));
                if (a[i][j].color == '#') {
                    queue.add(a[i][j]);
                }
            }
            a[i][w + 1] = new Cell(i, w + 1, '#');
        }
        for (int i = 0; i < w + 2; i++) {
            a[h + 1][i] = new Cell(h + 1, i, '#');
        }
        sc.close();

        Cell dark = null;
        int countMax = 0;
        while ((dark = queue.poll()) != null) {
            int operate = 0;
            int x = dark.x;
            int y = dark.y;
            if (a[x - 1][y].color == '.') {
                a[x - 1][y].color = '#';
                a[x - 1][y].count = a[x][y].count + 1;
                countMax = a[x - 1][y].count;
                queue.add(a[x - 1][y]);
            }
            if (a[x + 1][y].color == '.') {
                a[x + 1][y].color = '#';
                a[x + 1][y].count = a[x][y].count + 1;
                countMax = a[x + 1][y].count;
                queue.add(a[x + 1][y]);
            }
            if (a[x][y - 1].color == '.') {
                a[x][y - 1].color = '#';
                a[x][y - 1].count = a[x][y].count + 1;
                countMax = a[x][y - 1].count;
                queue.add(a[x][y - 1]);
            }
            if (a[x][y + 1].color == '.') {
                a[x][y + 1].color = '#';
                a[x][y + 1].count = a[x][y].count + 1;
                countMax = a[x][y + 1].count;
                queue.add(a[x][y + 1]);
            }
        }
        System.out.println(countMax);
    }

    static class Cell {
        public int x;
        public int y;
        public char color;
        public int count;
        
        public Cell(int x, int y, char color) {
            this.x = x;
            this.y = y;
            this.color = color;
            this.count = 0;
        }
    }
}
