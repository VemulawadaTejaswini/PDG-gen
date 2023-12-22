import java.util.ArrayDeque;
import java.util.Deque;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] hwn = br.readLine().split(" ");
        int h = Integer.parseInt(hwn[0]);
        int w = Integer.parseInt(hwn[1]);
        int n = Integer.parseInt(hwn[2]);
        //int[][] factories = new int[n][2];
        //int index = 1;
        char[][] grid = new char[h][w];
        int sx=-1, sy=-1;
        
        for (int i = 0; i < h; i++) {
            String raw = br.readLine();
            for (int j = 0; j < w; j++) {
                grid[i][j] = raw.charAt(j);
                if (grid[i][j] != '.' && grid[i][j] != 'X') {
                    if (grid[i][j] == 'S') {
                        sy = i;
                        sx = j;
                    }
                    /*else {
                        factories[index][0] = i;
                        factories[index][1] = j;
                        index++;
                    }*/
                }
            }
        }
        
        int next = 1;
        int[][] dfyxs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[h][w];
        int[][] distance = new int[h][w];
        distance[sy][sx] = 0;
        outer: while (true) {
            for (int[] dfyx: dfyxs) {
                if (sy-dfyx[0] < 0 || sx-dfyx[1] < 0 || sy-dfyx[0] >= h || sx-dfyx[1] >= w) continue;
                if (visited[sy-dfyx[0]][sx-dfyx[1]] == true) continue;
                if (grid[sy-dfyx[0]][sx-dfyx[1]] == (char)next) {
                    if (next == n) break outer;
                    next++;
                    visited = new boolean[h][w];
                }
                else if (grid[sy-dfyx[0]][sx-dfyx[1]] == '.') {
                    
                }
                else continue;
                visited[sy-dfyx[0]][sx-dfyx[1]] = true;
                distance[sy-dfyx[0]][sx-dfyx[1]] = distance[sy][sx] + 1;
                sy = sy-dfyx[0];
                sx = sx-dfyx[1];
                
            }
        }
        System.out.println(distance[sy][sx] + 1);
    }
}

