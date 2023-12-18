import java.awt.desktop.SystemSleepEvent;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		Integer[] c = new Integer[n];
		Integer[][] a = new Integer[n][m];
		int[] suma = new int[m];

		int fillCount = 0;
		boolean[] removeList = new boolean[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
				if (suma[j] < x && suma[j] + a[i][j] >= x) {
					fillCount++;
				}
				suma[j] += a[i][j];
			}
			removeList[i] = false;
		}

		if (fillCount == m) {
			// 出力
			System.out.println(sumPrice(0, new int[m], c, a, x, removeList));
		} else {
			// 出力
			System.out.println(-1);
		}

		sc.close();
	}

	public static int sumPrice(int price, int[] suma, Integer[] cList, Integer[][] aList, int border, boolean[] removeList) {
		int minPrice = 1200000;
		for (int i = 0; i < cList.length; i++) {
			if (!removeList[i]) {
				int tempPrice = price + cList[i];
				if (tempPrice < minPrice) {
					boolean judge = true;
					int[] tempSuma = new int[suma.length];
					for (int j = 0; j < suma.length; j++) {
						tempSuma[j] = suma[j] + aList[i][j];
						if (tempSuma[j] < border) {
							judge = false;
						}
					}

					if (!judge) {
						boolean[] tempRemoveList = new boolean[removeList.length];;
						System.arraycopy(removeList, 0, tempRemoveList, 0, removeList.length);
						tempRemoveList[i] = true;
						tempPrice = sumPrice(tempPrice, tempSuma, cList, aList, border, tempRemoveList);
					}

					if (tempPrice < minPrice) {
						minPrice = tempPrice;
					}
				}
			}
		}
		return minPrice;
	}
}
