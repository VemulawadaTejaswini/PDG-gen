import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] hw = br.readLine().split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        char[][] grid = new char[h+2][w+2];
        int[][] distance = new int[h+2][w+2];
        
        int sharp = 0;
        for (int i = 0; i < h; i++) {
            String row = br.readLine();
            for (int j = 0; j < w; j++) {
                grid[i+1][j+1] = row.charAt(j);
                if (grid[i+1][j+1]=='#') sharp++;
            }
        }
        
        Deque<Integer> xs = new ArrayDeque<Integer>();
        Deque<Integer> ys = new ArrayDeque<Integer>();
        
        xs.add(1);
        ys.add(1);
        distance[1][1] = 1;
        //distance[h][w] = -1;
        int[][] nexts = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int x = xs.remove();
        int y = ys.remove();
        boolean[][] visited = new boolean[h+2][w+2];
        
        int a = 0;
        boolean reachable = true;
        while (x!=w || y!=h) {
            for (int[] next: nexts) {
                if (visited[y-next[0]][x-next[1]]) continue;
                if (grid[y-next[0]][x-next[1]] == '.') {
                    visited[y-next[0]][x-next[1]] = true;
                    distance[y-next[0]][x-next[1]] = distance[y][x]+1; 
                    xs.add(x-next[1]);
                    ys.add(y-next[0]);
                    
                }
                /*else if (grid[y-next[0]][x-next[1]] == '#'){
                    //visited[y-next[0]][x-next[1]] = true;
                    //a++;
                }*/
                
            }
            if (xs.isEmpty()) {
                reachable = false;
                break;
            }
            x = xs.remove();
            y = ys.remove();
        }
        
        if (reachable) System.out.println(h*w-distance[y][x] - sharp);
        else System.out.println(-1);
        
    }
}
