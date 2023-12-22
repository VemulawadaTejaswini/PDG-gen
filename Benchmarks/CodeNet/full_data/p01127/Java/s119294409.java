import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int h, w;
	int[] minX = new int[26], minY = new int[26];
	int[] maxX = new int[26], maxY = new int[26];
	boolean[][] covered = new boolean[26][26];
	char[][] result;
	boolean ans;
	
	public void run() {
		int n = in.nextInt();
		for (int loopN = 0; loopN < n; loopN++) {
			ans = true;
			h = in.nextInt(); w = in.nextInt();
			Arrays.fill(maxX, -1);
			Arrays.fill(maxY, -1);
			Arrays.fill(minX, 101);
			Arrays.fill(minY, 101);
			for (int i = 0; i < covered.length; i++) {
				Arrays.fill(covered[i], false);
			}
			
			result = new char[h][w];
			for (int i = 0; i < h; i++) {
				result[i] = in.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (result[i][j] == '.') continue;
					int index = result[i][j] - 'A';
					minX[index] = Math.min(j, minX[index]);
					minY[index] = Math.min(i, minY[index]);
					maxX[index] = Math.max(j, maxX[index]);
					maxY[index] = Math.max(i, maxY[index]);
				}
			}
			
			end : for (int i = 0; i < maxX.length; i++) {
				if (minX[i] == 101 || maxX[i] == -1 || minY[i] == 101 || maxY[i] == -1)
					continue;
				
				for (int j = minY[i]; j <= maxY[i]; j++) {
					for (int k = minX[i]; k <= maxX[i]; k++) {
						if (result[j][k] == '.') {
							ans = false;
							break end;
						}
						int c = result[j][k] - 'A';
						if (i != c) {
							if (isCovered(i, c)) {
								ans = false;
								break end;
							}
						}
					}
				}
			}
			
			System.out.println((ans) ? "SAFE" : "SUSPICIOUS");
		}
	}
	
	public boolean isCovered(int c1, int c2) {
		if (covered[c1][c2]) return true;
		
		for (int i = 0; i < covered.length; i++) {
			if (covered[c1][i]) {
				if (isCovered(i, c2)) return true;
			}
		}
		
		covered[c2][c1] = true;
		return false;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}