import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


/**
 * Created by kazuki on 2014/07/08.
 */
public class Main {
    static Scanner s = new Scanner(System.in);
    static int num;
    static int[][] map = new int[200][200];
    static Deque<Integer> queue = new ArrayDeque<Integer>();


    static void move(int x, int y, int turn) {
        if (map[x][y] == -2) return;
        if (map[x][y] == -1) {
            num++;
            map[x][y] = -2;
        }
        if (turn == 0) return;
        queue.offer((turn - 1) * 10000 + (x + 1) * 100 + (y + 1));
        queue.offer((turn - 1) * 10000 + (x + 1) * 100 + (y));
        queue.offer((turn - 1) * 10000 + (x) * 100 + (y + 1));
        queue.offer((turn - 1) * 10000 + (x) * 100 + (y - 1));
        queue.offer((turn - 1) * 10000 + (x - 1) * 100 + (y));
        queue.offer((turn - 1) * 10000 + (x - 1) * 100 + (y - 1));
    }

    public static void main(String[] args) {
        int turn, object;
        int x, y,xx,yy,tt,p;
        int i,j;

        while (true) {
            turn = s.nextInt();
            object = s.nextInt();

            if (turn == 0 && object == 0) break;

            for (i = 0; i < 200; i++) {
                for (j = 0; j < 200; j++)
                    map[i][j] = -1;
            }
            num = 0;

            for (i = 0; i < object; i++) {
                x = s.nextInt() + 60;
                y = s.nextInt() + 60;

                map[x][y] = -2;
            }

            x = s.nextInt() + 60;
            y = s.nextInt() + 60;

            queue.offer(turn * 10000 + x * 100 + y);

            while (!queue.isEmpty()) {
                p = queue.poll();
                tt = p / 10000;
                xx = (p / 100) % 100;
                yy = p % 100;

                move(xx, yy, tt);
            }
            System.out.println(num);
        }
    }
}