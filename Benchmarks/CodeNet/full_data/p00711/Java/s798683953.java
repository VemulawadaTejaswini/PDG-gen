import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while (!(line = br.readLine()).equals("0 0")) {
            int w = Integer.parseInt(line.substring(0, line.indexOf(' ')));
            int h = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
            char[][] map = new char[h + 2][w + 2];

            ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
            int count = 0;

            for (int i = 1; i < h + 1; i++) {
                line = br.readLine();
                for (int j = 1; j < w + 1; j++) {
                    map[i][j] = line.charAt(j - 1);
                    if (map[i][j] == '@') {
                        queue.offer(new int[]{i, j});
                        map[i][j] = '#';
                        count++;
                    }
                }
            }

            int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            while (queue.size() > 0) {

                int[] curr = queue.poll();
                char tile;
                for (int i = 0; i < dir.length; i++) {
                    tile = map[curr[0] + dir[i][0]][curr[1] + dir[i][1]];
                    if (tile == '.') {
                        queue.offer(new int[]{
                                curr[0] + dir[i][0], curr[1] + dir[i][1]
                        });
                        map[curr[0] + dir[i][0]][curr[1] + dir[i][1]] = '#';
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}