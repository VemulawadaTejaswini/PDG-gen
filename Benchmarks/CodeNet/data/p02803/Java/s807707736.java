import java.awt.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] field = new boolean[h][w];

        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                field[i][j] = s.charAt(j) == '.';
            }
        }

        int max = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(field[i][j]){
                    int[][] count = new int[h][w];
                    LinkedList<Point> q = new LinkedList<>();
                    q.add(new Point(j, i));
                    while(!q.isEmpty()){
                        Point p = q.poll();
                        for(int k = 0; k < 4; k++){
                            int y = p.y + dy[k];
                            int x = p.x + dx[k];
                            if(x < 0 || y < 0 || x >= w || y >= h){
                                continue;
                            }
                            if(!field[y][x] || count[y][x] > 0){
                                continue;
                            }
                            count[y][x] = count[p.y][p.x] + 1;
                            max = Math.max(max, count[y][x]);
                            q.add(new Point(x, y));
                        }
                    }
                }
            }
        }

        System.out.print(max);

    }
}
