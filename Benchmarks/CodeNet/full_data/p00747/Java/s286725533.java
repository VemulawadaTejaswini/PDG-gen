import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    static int W, H;
    static int[][] maze;
    static Queue<Param> array = new LinkedList<Param>();

    static class Param {
        int x, y, route;

        Param(int x, int y, int route) {
            this.x = x;
            this.y = y;
            this.route = route;
        }
    }

    public static void main(String[] args) {

        while (true) {
            W = s.nextInt();
            H = s.nextInt();

            if (W == 0 && H == 0) break;

            maze = new int[H * 2+1][W * 2+1];

            for (int i = 1; i < H * 2; i++) {
                int j = 1;
                if (i % 2 == 1) j++;
                for (; j < W * 2; j += 2) {
                    int temp = s.nextInt();
                    if (temp == 0) maze[i][j] = 0;
                    else maze[i][j] = -1;
                }
            }

            array.add(new Param(1, 1, 0));
            while (!array.isEmpty()) {
                Param temp;
                temp = array.poll();
                search(temp.x, temp.y, temp.route);
            }

            System.out.println(maze[H*2-1][W*2-1]);

        }
    }

    static void search(int x, int y, int route) {
        if (x < 1 || x >= W * 2 || y < 1 || y >= H * 2) return;
//        if (maze[y][x] == -1) return;
        if (maze[y][x] > 0) return;
        maze[y][x] = route + 1;


        if (maze[y][x + 1] == 0)
            array.add(new Param(x + 2, y, route + 1));
        if (maze[y][x - 1] == 0)
            array.add(new Param(x - 2, y, route + 1));
        if (maze[y + 1][x] == 0)
            array.add(new Param(x, y + 2, route + 1));
        if (maze[y - 1][x] == 0)
            array.add(new Param(x, y - 2, route + 1));
    }
}