import java.util.Scanner;

public class Main {
	static boolean[][] islandFlag;
	static int[][] islandNum;
	static int ptr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			islandFlag = new boolean[12][12];
			for (int i = 0; i < 12; i++) {
				String str = sc.next();
				for (int j = 0; j < 12; j++) {
					if (str.charAt(j) == '0') {
						islandFlag[i][j] = false;
					} else {
						islandFlag[i][j] = true;
					}
				}
			}
			islandNum = new int[12][12];
			ptr = 0;
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) {
					if (islandFlag[i][j] && islandNum[i][j] == 0) {
						ptr++;
						makeIsland(i, j);
					}
				}
			}
			System.out.println(ptr);
		}
	}

	static void makeIsland(int i, int j) {
		if (islandFlag[i][j] && islandNum[i][j] == 0) {
			islandNum[i][j] = ptr;
			if (i > 0) {
				makeIsland(i - 1, j);
			}
			if (j > 0) {
				makeIsland(i, j - 1);
			}
			if (i < 11) {
				makeIsland(i + 1, j);
			}
			if (j < 11) {
				makeIsland(i, j + 1);
			}
		}
	}
}