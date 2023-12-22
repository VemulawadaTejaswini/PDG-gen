import java.util.*;

public class Main {
    public static int[][] map;
    public static int W;
    public static int H;
    public static int[] iAdj = {-1,-1,-1,0,0,1,1,1};
    public static int[] jAdj = {-1,0,1,-1,1,-1,0,1};
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            W = sc.nextInt();
            H = sc.nextInt();
            if (W == 0 && H == 0) break;
            
            int count = 0;
            map = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] > 0) {
                        count++;
                        floodFill(i,j);
                    }
                }
            }
            
            System.out.println(count);
        }
    }
    
    public static void floodFill(int i, int j) {
        if (i < 0 || i >= H || j < 0 || j >= W) return;
        if (map[i][j] == 0) return;
        map[i][j] = 0;
        for (int x = 0; x < 8; x++) {
            floodFill(i + iAdj[x], j + jAdj[x]);
        }
    }
}


