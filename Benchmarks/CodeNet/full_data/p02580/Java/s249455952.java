import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[] xCounts = new int[h];
        int[] yCounts = new int[w];
        int[][] maps = new int[h][w];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xCounts[x - 1]++;
            yCounts[y - 1]++;
            maps[x - 1][y - 1] = 1;
        }

        int max = 0;
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < w; y++) {
                int cur = xCounts[x];
                if (maps[x][y] == 1) {
                    cur--;
                }
                max = Math.max(max, cur + yCounts[y]);
            }
        }
        System.out.println(max);
      
	}
}