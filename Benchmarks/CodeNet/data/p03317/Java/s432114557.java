import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		bubbleSort(a);// 最小で行うために、一度昇順に並び替える
		int cnt = 0;
		// 置き換え済みの末尾からk個を末尾まで繰り返す
		for (int i = 0; i <= a.length - 1; i += (k - 1)) {
			int minIndex = i;
			boolean isSmall = false;

			// 配列エラー対策
			if (a.length - 1 - i >= 3) { // k個取れる時
				for (int j = i; j < i + k; j++) {
					if (a[j] < a[minIndex]) {
						minIndex = j;
						isSmall = true;
					}
				}
					for (int j = i; j < i + k; j++) {
						a[j] = a[minIndex];
					}
					cnt++;



			} else { // 取れないときは後ろから
				for (int h = a.length - 1; h >= a.length - k; h--) {
					if (a[h] < a[minIndex]) {
						minIndex = h;
						isSmall = true;
					}

				}
					for (int h = a.length - 1; h >= a.length - k; h--) {
						a[h] = a[minIndex];
					}
					cnt++;


			}
		}

		System.out.println(cnt);

	}

	public static int bubbleSort(int[] array) {
		int cnt = 0;// 交換回数
		boolean flg = true;
		for (int i = 0; flg; i++) { // iは未ソート部分列の先頭インデックス
			flg = false;
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
					flg = true;
					cnt++;
				}
			}

		}
		return cnt;
	}

}
