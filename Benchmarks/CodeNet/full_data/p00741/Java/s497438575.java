import java.util.Scanner;

public class Main {
    static int w; // <= 50
    static int h; // <= 50
    static int[][] map;
    static int islands;
    static Scanner sc = new Scanner(System.in);
    static int[][] directions = {{0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}, {-1,-1}, {-1,0}, {-1,1}};

    public static void paintIsland(int x, int y) {
        map[y][x] = 0;
        for (int k = 0; k < directions.length; k++) {
            int nx = x + directions[k][0];
            int ny = y + directions[k][1];

            if (nx >= 0 && nx < w && ny >= 0 && ny < h && map[ny][nx] == 1)
                paintIsland(nx, ny);
        }

    }


    public static void main(String[] args) {
        while (true) {
            // Initialize variables
            islands = 0;
            w = sc.nextInt();
            h = sc.nextInt();
            map = new int[h][w];
            if (w == 0 && h == 0)
                break;

            // initialize map
            String[] rowStr;
            int[] row;
            for (int i = 0; i < h; i++) {
                row = new int[w];
                for (int j = 0; j < w; j++) {
                    row[j] = sc.nextInt();
                }
                map[i] = row;
            }

            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (map[y][x] == 1) {
                        paintIsland(x, y);
                        islands++;
                    }
                }
            }

            // out: number of islands
            System.out.println(islands);
        }
    }
}