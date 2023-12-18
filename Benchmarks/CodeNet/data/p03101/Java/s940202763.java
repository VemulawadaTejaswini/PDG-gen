import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] map = new boolean[H][W];
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < W; j++) {
                map[i][j] = true;
            }
        }
        for(int i = 0; i < w; i++) {
            for(int j = 0; j < H; j++) {
                map[j][i] = true;
            }
        }
        int ans = 0;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(!map[i][j]) ans++;
            }
        }
        System.out.println(ans);
    } 
}