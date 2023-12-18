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
      update(0, road, step, H - 1, 0, H, W);
		System.out.println(step[0][W - 1]);
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
}