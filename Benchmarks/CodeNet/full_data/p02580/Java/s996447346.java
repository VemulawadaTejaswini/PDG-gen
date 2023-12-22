import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[] xCounts = new int[h + 1];
        int[] yCounts = new int[w + 1];
        int[][] maps = new int[h + 1][w + 1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xCounts[x]++;
            yCounts[y]++;
            maps[x][y] = 1;
        }

        int max = 0;
        for (int x = 1; x <= h; x++) {
            for (int y = 1; y <= w; y++) {
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