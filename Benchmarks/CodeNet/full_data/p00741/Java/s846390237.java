//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w, h;
        while (true) {
            String[] wh = br.readLine().split(" ");
            w = Integer.parseInt(wh[0]);
            h = Integer.parseInt(wh[1]);
            if (w == 0 && h == 0) break;
            map = new int[h+2][w+2];
            visited = new boolean[h+2][w+2];
            int count = 0;
            
            for (int i = 0; i < h; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    map[i+1][j+1] = Integer.parseInt(line[j]);
                }
            }
            
            for (int k = 0; k < h; k++) {
                for (int l = 0; l < w; l++) {
                    if (map[k+1][l+1] == 1 && !visited[k+1][l+1]) {
                        dfs(k+1, l+1);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int raw, int column) {
        int[] df = {-1, 0, 1};
        for (int raw_df: df) {
            for (int column_df: df) {
                if (raw_df==0 && column_df==0) continue;
                if (map[raw-raw_df][column-column_df] == 0 || visited[raw-raw_df][column-column_df]) {
                    continue;
                }
                else {
                    visited[raw-raw_df][column-column_df] = true;
                    dfs(raw-raw_df, column-column_df);
                }
            }
        }
    }
}

