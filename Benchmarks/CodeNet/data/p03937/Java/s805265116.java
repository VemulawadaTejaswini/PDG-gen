
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        test();
        Scanner sc = new Scanner(System.in);
        int h, w;
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        String[] input;
        input = sc.nextLine().trim().split(" ");
        h = Integer.parseInt(input[0]);
        w = Integer.parseInt(input[1]);

        int[][] map = new int[h][w];
        for (int i = 0; i < h; i++) {
            input = sc.nextLine().trim().split("");
            for (int j = 0; j < w; j++) {
                map[i][j] = input[j].equals("#") ? 1 : 0;
            }
        }

        int x = 0;
        int y = 0;
        int nx = 0;
        int ny = 0;
        int count;
        String ans = "Possible";
        outer:
        while (true) {
            map[y][x] = 0;
            count = 0;
//            System.out.println(Arrays.deepToString(map));
            for (int[] direction : directions) {
                if ( y + direction[0] >= 0 && y + direction[0] < map.length &&
                        x + direction[1] >= 0 && x + direction[1] < map[0].length) {
                    if (map[y + direction[0]][x + direction[1]] == 1) {
                        nx = x + direction[1];
                        ny = y + direction[0];
                        if (direction[0] < 0 || direction[1] < 0) {
                            ans = "Impossible";
//                            System.out.println("here");
//                            System.out.println(nx + " " + ny);
                            break outer;
                        }
                        count++;
                    }
                }
            }
            if (count > 1) {
//                System.out.println("here2");
                ans = "Impossible";
                break;
            }
            x = nx;
            y = ny;
//            System.out.println(x + ", " + y);
            if (x == map[0].length - 1 && y == map.length - 1) break;
        }
        System.out.println(ans);
    }
}
