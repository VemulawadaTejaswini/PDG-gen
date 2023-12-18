
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveC();
		new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int[] height = new int[numN];
			for (int i = 0; i < numN; i++) {
				height[i] = scanner.nextInt();
			}

			int[] costArray = new int[numN];
			Arrays.fill(costArray, Integer.MAX_VALUE);
			costArray[0] = 0;
			for (int i = 0; i < height.length; i++) {
				for (int j = 1; j <= 2 && j + i < numN; j++) {
					int cost = Math.min(Math.abs(height[i + j] - height[i]) + costArray[i], costArray[i + j]);
					costArray[i + j] = cost;
				}
			}

			System.out.println(costArray[numN - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numK = scanner.nextInt();

			int[] height = new int[numN];
			for (int i = 0; i < numN; i++) {
				height[i] = scanner.nextInt();
			}

			int[] costArray = new int[numN];
			Arrays.fill(costArray, Integer.MAX_VALUE);
			costArray[0] = 0;
			for (int i = 0; i < height.length; i++) {
				for (int j = 1; j <= numK && j + i < numN; j++) {
					int cost = Math.min(Math.abs(height[i + j] - height[i]) + costArray[i], costArray[i + j]);
					costArray[i + j] = cost;
				}
			}

			System.out.println(costArray[numN - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int dayNum = 0;

		try {
			scanner = new Scanner(System.in);
			dayNum = scanner.nextInt();

			int[][] koufukuBase = new int[dayNum][3];

			for (int i = 0; i < dayNum; i++) {
				koufukuBase[i][0] = scanner.nextInt();
				koufukuBase[i][1] = scanner.nextInt();
				koufukuBase[i][2] = scanner.nextInt();
			}

			int[][] koufukuArray = new int[dayNum][3];

			for (int i = 0; i < koufukuBase.length; i++) {
				if (i == 0) {
					koufukuArray[i][0] = koufukuBase[i][0];
					koufukuArray[i][1] = koufukuBase[i][1];
					koufukuArray[i][2] = koufukuBase[i][2];
				} else {
					koufukuArray[i][0] = Math.max(koufukuBase[i][0] + koufukuArray[i - 1][1], koufukuBase[i][0] + koufukuArray[i - 1][2]);
					koufukuArray[i][1] = Math.max(koufukuBase[i][1] + koufukuArray[i - 1][0], koufukuBase[i][1] + koufukuArray[i - 1][2]);
					koufukuArray[i][2] = Math.max(koufukuBase[i][2] + koufukuArray[i - 1][0], koufukuBase[i][2] + koufukuArray[i - 1][1]);
				}

			}
			int cnt = 0;
			for (int i = 0; i < 3; i++) {
				cnt = Math.max(koufukuArray[dayNum - 1][i], cnt);
			}

			System.out.println(cnt);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int katiTotal(int currentI, int currentSum) throws Exception {

		try {
			if (currentI == numN || currentSum < 0) {
				return 0;
			} else if (katiArray[currentI][currentSum] != Integer.MIN_VALUE) {
				return katiArray[currentI][currentSum];
			} else if (currentSum < knapsack[currentI][0]) {
				return katiTotal(currentI + 1, currentSum);
			} else {
				int val1 = katiTotal(currentI + 1, currentSum);
				int val2 = katiTotal(currentI + 1, currentSum - knapsack[currentI][0]) + knapsack[currentI][1];
				katiArray[currentI][currentSum] = Math.max(val1, val2);
				return katiArray[currentI][currentSum];
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("currentI : " + currentI + " /currentSum:" + currentSum + " /numW:" + numW + " /currentSum < numW:" + (currentSum < numW));
			throw e;
		}

	}

	private int numW = 0;
	private int numN = 0;
	private int[][] knapsack;
	private int[][] katiArray;

	private void solveD() throws Exception {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numW = scanner.nextInt();
			knapsack = new int[numN][2];
			katiArray = new int[numN + 1][numW + 1];
			for (int i = 0; i < numN; i++) {
				knapsack[i][0] = scanner.nextInt();
				knapsack[i][1] = scanner.nextInt();
				Arrays.fill(katiArray[i], Integer.MIN_VALUE);
			}

			System.out.println(katiTotal(0, numW));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}