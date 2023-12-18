import java.io.*;
import java.util.*;

public class Main{
    int ans = 1, H, W;
    char[][] maze;
    int[] dr = new int[]{1,0,-1,0}, dc = new int[]{0,1,0,-1};
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
        int res = main.solve();
        System.out.println(res);
    }
    int solve(){
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt(); W = sc.nextInt();
        maze = new char[H][W];
        for(int i=0;i<H;i++){
            String s = sc.next();
            for(int j=0;j<W;j++) maze[i][j] = s.charAt(j);
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(maze[i][j]=='#') continue;
                ans = Math.max(ans,startFrom(i,j));
            }
        }
        return ans;
    }
    int startFrom(int sR, int sC){
        int step = 0;
        Queue<int[]> current = new LinkedList<>(), next = new LinkedList<>();
        current.add(new int[]{sR,sC});
        boolean[][] visited = new boolean[H][W];
        visited[sR][sC] = true;
        while(current.size()>0){
            for(int[] now:current) {
                int curR = now[0], curC = now[1];
                for (int j = 0; j < 4; j++) {
                    int r = curR + dr[j], c = curC + dc[j];
                    if (r >= 0 && r < H && c >= 0 && c < W && (!visited[r][c]) && maze[r][c]=='.') {
                        visited[r][c] = true;
                        next.add(new int[]{r, c});
                    }
                }
            }
            if(next.size()>0){
                step += 1;
            }
            current = next;
            next = new LinkedList<>();
        }
        return step;
    }
}

