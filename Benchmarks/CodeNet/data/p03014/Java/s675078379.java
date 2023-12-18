import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w = in.nextInt();
        char[][] areaCharred = new char[h][w];
        int[][] horizontalLight = new int[h][w];
        int[][] verticalLight = new int[w][h];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++){
            areaCharred[i] = in.next().toCharArray();
        }
        for (int i = 0; i < h; i++){
            int prevH = 0;
            for (int j = 0; j < w; j++){
                if (areaCharred[i][j] == '#'){
                    Arrays.fill(horizontalLight[i], prevH, j, j - prevH);
                    prevH = j + 1;
                }
            }
            Arrays.fill(horizontalLight[i], prevH, w, w - prevH);
        }
        for (int i = 0; i < w; i++){
            int prevV = 0;
            for (int j = 0; j < h; j++){
                if (areaCharred[j][i] == '#') {
                    Arrays.fill(verticalLight[i], prevV, j, j - prevV);
                    prevV = j + 1;
                }
            }
            Arrays.fill(verticalLight[i], prevV, h, h - prevV);
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                max = Math.max(horizontalLight[i][j] + verticalLight[j][i] - 1, max);
            }
        }
        System.out.println(max);
    }
}
