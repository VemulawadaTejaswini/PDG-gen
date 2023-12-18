import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] map = new int[h][w];
        int num = 0;
        for(int i=0; i<h; i++){
            String tmp = sc.next();
            for(int j=0; j<w; j++){
                if(tmp.charAt(j) == '.'){
                    map[i][j] = 0;
                    num++;
                }else{
                    map[i][j] = -1;
                }
            }
        }

        int dx[] = new int[]{1, 0, -1, 0};
        int dy[] = new int[]{0, 1, 0, -1};
        int[] pos = new int[3];
        Queue<int[]> next = new ArrayDeque<int[]>();
        pos[0] = 0;
        pos[1] = 0;
        map[0][0] = 1;
        next.add(pos);

        while(!next.isEmpty()){
            int[] mpos = next.poll();
            int mx = mpos[0];
            int my = mpos[1];
            
            for(int i=0; i<4; i++){
                int nx = mx+dx[i];
                int ny = my+dy[i];
                if(nx >= 0 && nx < h && ny >= 0 && ny < w){
                    if(map[nx][ny] == 0){
                        map[nx][ny] = map[mx][my] + 1;
                        next.add(new int[]{nx, ny});
                    }
                }
            }
        }

        if(map[h-1][w-1] == 0){
            System.out.println(-1);
        }else{
            System.out.println(num - map[h-1][w-1]);
        }
    }   
}