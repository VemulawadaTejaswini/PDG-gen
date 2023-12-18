import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int q = sc.nextInt();
		boolean[][] field = new boolean[h + 1][w + 1];
		int[][] sums = new int[h + 1][w + 1];
		int[][] hCounts = new int[h + 1][w + 1];
		int[][] wCounts = new int[h + 1][w + 1];
		int[][] haCounts = new int[h + 1][w + 1];
		int[][] waCounts = new int[h + 1][w + 1];
		for (int i = 1; i <= h; i++) {
		    char[] arr = sc.next().toCharArray();
		    for (int j = 1; j <= w; j++) {
		        field[i][j] = arr[j - 1] == '1';
		        sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1];
		        if (field[i][j]) {
		            sums[i][j]++;
		        }
		        hCounts[i][j] = hCounts[i - 1][j] + hCounts[i][j - 1] - hCounts[i - 1][j - 1];
		        haCounts[i][j] = haCounts[i][j - 1];
		        if (field[i][j] && field[i - 1][j]) {
		            hCounts[i][j]++;
		            haCounts[i][j]++;
		        }
		        wCounts[i][j] = wCounts[i - 1][j] + wCounts[i][j - 1] - wCounts[i - 1][j - 1];
		        waCounts[i][j] = waCounts[i - 1][j];
		        if (field[i][j] && field[i][j - 1]) {
		            wCounts[i][j]++;
		            waCounts[i][j]++;
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    int ans = sums[x2][y2] - sums[x1 - 1][y2] - sums[x2][y1 - 1] + sums[x1 - 1][y1 - 1];
		    ans -= hCounts[x2][y2] - hCounts[x1 - 1][y2] - hCounts[x2][y1 - 1] + hCounts[x1 - 1][y1 - 1] - (haCounts[x1][y2] - haCounts[x1][y1 - 1]);
		    ans -= wCounts[x2][y2] - wCounts[x1 - 1][y2] - wCounts[x2][y1 - 1] + wCounts[x1 - 1][y1 - 1] - (waCounts[x2][y1] - waCounts[x1 - 1][y1]);
		    sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}
