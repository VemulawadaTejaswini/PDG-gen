import java.util.*;

public class Main {
    public static int R, C;
    public static int[][] map;
    public static int[][] distMap;
    public static int[] iAdj = {-1,1,0,0};
    public static int[] jAdj = {0,0,-1,1};
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            C = sc.nextInt();
            R = sc.nextInt();
            if (R == 0 && C == 0) break;
            
            map = new int[R][C];
            distMap = new int[R][C];
            
            int startPosX = -1;
            int startPosY = -1;
            int endPosX = -1;
            int endPosY = -1;
            
            for (int i = 0; i < R; i++) {
                Arrays.fill(distMap[i], 999);
                for (int j = 0; j < C; j++) {
                    map[i][j] = sc.nextInt();
                    if (map[i][j] == 2) {
                        startPosX = j;
                        startPosY = i;
                    } else if (map[i][j] == 3) {
                        endPosX = j;
                        endPosY = i;
                    }
                }
            }
            
            flood(startPosY, startPosX, 6, 0);
            
            if (distMap[endPosY][endPosX] == 999)
                System.out.println(-1);
            else
                System.out.println(distMap[endPosY][endPosX]);
        }
    }
    
    public static void flood(int i, int j, int energy, int t) {
        if (energy <= 0) return;
        if (i < 0 || i >= R || j < 0 || j >= C) return;
        if (map[i][j] == 0) return;
        
        if (t < distMap[i][j]) {
            distMap[i][j] = t;
            if (map[i][j] == 4) {
                energy = 6;
            }
        }
        
        for (int x = 0; x < 4; x++) {
            flood(i + iAdj[x], j + jAdj[x], energy - 1, t + 1);
        }
    }
}


