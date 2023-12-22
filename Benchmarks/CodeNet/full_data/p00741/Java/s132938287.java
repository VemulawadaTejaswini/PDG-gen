
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        while(true){
            String[] line = reader.readLine().split(" ");
            int w = Integer.parseInt(line[0]), h = Integer.parseInt(line[1]);
            if(w==0 && h==0) break;

            int[][] map = new int[h][w];
            for(int i=0; i<h; i++){
                line = reader.readLine().split(" ");
                for(int j=0; j<w; j++){
                    map[i][j] = Integer.parseInt(line[j]);
                }
            }
            int land = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(map[i][j] == 1){
                        removeLand(map, j, i);
                        land++;
                    }
                }
            }
            System.out.println(land);

        }
    }

    public static void removeLand(int[][] map, int x, int y){
        if(y<0 || y>=map.length || x<0 || x>=map[y].length){
            return;
        }
        if(map[y][x] == 1){
            map[y][x] = 0;
            removeLand(map, x-1, y-1);
            removeLand(map, x-1, y);
            removeLand(map, x-1, y+1);
            removeLand(map, x, y+1);
            removeLand(map, x, y-1);
            removeLand(map, x+1, y-1);
            removeLand(map, x+1, y);
            removeLand(map, x+1, y+1);
        }
    }
}