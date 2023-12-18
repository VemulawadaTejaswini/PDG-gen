import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static boolean visited[][];
    static int[][] s;
    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int H = scan.nextInt();
        int W = scan.nextInt();
        s = new int[H][W];
        for(int i = 0; i < H; i++) {
            String tmp = scan.next();
            for(int j = 0; j < W; j++){
                if(tmp.charAt(j) == '.')
                    s[i][j] = 0;
                else
                    s[i][j] = 1;
            }
        }

        int ans = 0;
        for(int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                for(int k = i; k < H; k++) {
                    int l;
                    if(k == i)
                        l = j+1;
                    else
                        l = 0;
                    for (; l < W; l++) {
                        if(s[i][j] != 0 || s[k][l] != 0) continue;
                        visited = new boolean[H][W];
//                        System.out.println("start " + i + " " + j + " end " + k + " " + l);
                        int level = bfs(new int[]{i,j}, new int[]{k,l});
//                        System.out.println("level " + level);
                        ans = Math.max(ans, level);
                    }
                }
            }
        }

        os.println(ans);
    }

    static int[][] dirs={{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public static int bfs(int[] start, int[] end){
        visited[start[0]][start[1]] = true;
        int level = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            Queue<int[]> queue2 = new LinkedList<>();
            while (!queue.isEmpty()) {
                int[] p = queue.remove();
                if (p[0] == end[0] && p[1] == end[1])
                    return level;
                for (int[] dir : dirs) {
                    int x = p[0] + dir[0];
                    int y = p[1] + dir[1];
                    if (x >= 0 && y >= 0 && x < s.length && y < s[0].length && s[x][y] == 0) {
                        if (!visited[x][y]) {

                            queue2.add(new int[]{x, y});
                            visited[x][y] = true;
                        }
                    }
                }
            }
            queue = queue2;
            level++;
        }

        return level;
    }
}