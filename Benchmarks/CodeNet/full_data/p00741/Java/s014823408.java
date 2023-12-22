import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/29.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);
    static int[][] map_tile;
    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
    static int[] dy = {1, 1, 1, 0, -1, -1, -1, 0};

    public static void main(String args[]){
        int w, h, islandcount;
        while((w = sc.nextInt()) != 0 && (h = sc.nextInt()) != 0){
            islandcount = 0;
            map_tile = new int[h+2][w+2];
            for(int i = 0; i <= w+1; i++) map_tile[0][i] = 0;
            for(int i = 1; i <= h; i++){
                for(int j = 0; j <= w+1; j++){
                    map_tile[i][j] = (j == 0 || j == w+1) ? 0 : sc.nextInt();
                }
            }
            for(int i = 0; i <= w+1; i++) map_tile[h+1][i] = 0;
            for(int i = 1; i <= h; i++){
                for(int j = 0; j <= w+1; j++){
                    if(map_tile[i][j] == 1){
                        islandcount++;
                        deleteIsland(i, j);
                    }
                }
            }
            System.out.println(islandcount);
        }
    }

    public static void deleteIsland(int x, int y){
        map_tile[x][y] = 0;
        for(int i = 0; i < dx.length; i++){
            if(map_tile[x + dy[i]][y + dx[i]] == 1){
                deleteIsland(x + dy[i], y + dx[i]);
            }
        }
    }
}