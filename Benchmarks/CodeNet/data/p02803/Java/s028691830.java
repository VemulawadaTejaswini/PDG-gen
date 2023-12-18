import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean[][] road = new boolean[H][W];
		for (int i = 0; i < H; i++) {
         String line = sc.next();
         for (int j = 0; j < W; j++) {
            if (line.charAt(j) == '.') {
               road[i][j] = true;
            } else {
               road[i][j] = false;
            }
         }
      }
      int[][] step = new int[H][W];
      for (int i = 0; i < H; i++) {
         for (int j = 0; j < W; j++) {
            step[i][j] = -1;
         }
      }
      int max = 0;
      for (int i = 0; i < H; i++) {
         for (int j = 0; j < W; j++) {
            if (road[i][j]) {
               update(0, road, step, i, j, H, W);
               max = Math.max(max, max(step, H, W));
            }
         }
      }
		System.out.println(max);
	}
   
   public static void update(int value, boolean[][] road, int[][] step, int i, int j, int H, int W) {
      if (i >= 0 && i < H && j >= 0 && j < W && road[i][j]) {
         if (step[i][j] == -1 || step[i][j] > value) {
            step[i][j] = value;
            update(value + 1, road, step, i - 1, j, H, W);
            update(value + 1, road, step, i + 1, j, H, W);
            update(value + 1, road, step, i, j - 1, H, W);
            update(value + 1, road, step, i, j + 1, H, W);
         }
      }
   }
   
   public static int max(int[][] step, int H, int W) {
      int max = 0;
      for (int i = 0; i < H; i++) {
         for (int j = 0; j < W; j++) {
            max = Math.max(max, step[i][j]);
         }
      }
      return max;
   }
}