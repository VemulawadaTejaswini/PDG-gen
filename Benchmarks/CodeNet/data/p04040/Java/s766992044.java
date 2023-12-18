import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int h = Integer.parseInt(line[0]);
        int w = Integer.parseInt(line[1]);
        int a = Integer.parseInt(line[2]);
        int b = Integer.parseInt(line[3]);
        int[][] map = new int[h + 1][w + 1];
        map[1][1] = 1;
        for (int i = 1; i < h + 1; i++){
            for (int j = 1; j < w + 1; j++){
                if (i >= h - a + 1 && j < b + 1){
                    map[i][j] = 0;
                }else{
                    map[i][j] += map[i - 1][j] + map[i][j - 1];
                }
            }
        }
        //System.out.println(Arrays.deepToString(map));
        System.out.println(map[h][w]%(1000000000+7));
    }
}
