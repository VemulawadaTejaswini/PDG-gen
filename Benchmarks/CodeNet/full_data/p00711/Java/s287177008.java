import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static int c = 0;
    static int[][] directions = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    static int[][] m;

    public static void spreadFrom(int x, int y) {
        if (m[y][x] == 0) {
            m[y][x] = 1;
            c++;
        }

        for (int k =0; k < 4; k++) {
            int nx = x + directions[k][0];
            int ny = y + directions[k][1];
            if (nx >= 0 && nx < m[y].length && ny >= 0 && ny < m.length) {
                spreadFrom(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            c = 0;
            int W = sc.nextInt();
            int H = sc.nextInt();
            if (W == 0 && H == 0)
                break;
            m = new int[H][W];
            int[] start = new int[2];
            for (int i = 0; i < H; i++) {
                String rowStr = sc.next();
                for (int j = 0; j < W; j++) {
                    int point;
                    switch (Character.toString(rowStr.charAt(j))) {
                        case ".":
                            point = 1;
                            break;
                        case "#":
                            point = 0;
                            break;
                        case "@":
                            point = 2;
                            start[0] = i;
                            start[1] = j;
                            break;
                        default:
                            throw new NoSuchElementException();
                    }
                    m[i][j] = point;
                }
            }
            spreadFrom(start[0], start[1]);
            System.out.println(c);
        }
    }
}