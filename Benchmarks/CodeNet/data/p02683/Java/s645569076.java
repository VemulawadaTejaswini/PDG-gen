import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] c = new int[n];
		int[][] a = new int[n][m];
		int[] suma = new int[m];

		int fillCount = 0;
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
				if (suma[j] < x && suma[j] + a[i][j] >= x) {
					fillCount++;
				}
				suma[j] += a[i][j];
			}
		}

		if (fillCount == m) {
			// 出力
			System.out.println(sumPrice(0, new int[m], c, a, x));
		} else {
			// 出力
			System.out.println(-1);
		}

		sc.close();
	}

	public static int sumPrice(int price, int[] suma, int[] cList, int[][] aList, int border) {
		int minPrice = 1200000;
		for (int i = 0; i < cList.length; i++) {
			int tempPrice = price + cList[i];
			boolean judge = true;
			int[] tempSuma = new int[suma.length];
			for (int j = 0; j < suma.length; j++) {
				tempSuma[j] = suma[j] + aList[i][j];
				if (tempSuma[j] < border) {
					judge = false;
				}
			}

			if (!judge) {
				int[] tempCList = new int[cList.length - 1];
				int[][] tempAList = new int[cList.length - 1][suma.length];
				int x = 0;
				for (int j = 0; j < cList.length; j++) {
					if (i != j) {
						tempCList[x] = cList[j];
						for (int k = 0; k < suma.length; k++) {
							tempAList[x][k] = aList[j][k];
						}
						x++;
					}
				}
				tempPrice = sumPrice(tempPrice, tempSuma, tempCList, tempAList, border);
			}

			if (tempPrice < minPrice) {
				minPrice = tempPrice;
			}
		}
		return minPrice;
	}
}
