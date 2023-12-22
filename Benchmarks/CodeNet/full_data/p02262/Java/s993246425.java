import java.util.Scanner;

public class Main {
	public static int cnt = 0;
	public static int m = 0;
	public static int[] G = new int[100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = scan.nextInt();
		}
		shellSort(array, num);

		// output
		System.out.println(m);
		//shellsortでm-1から入力しているのでm-1から出力していく
		System.out.print(G[m - 1]);
		for (int i = m - 2; i >= 0; i--) {
			System.out.print(" " + G[i]);
		}
		System.out.println();
		System.out.println(cnt);
		for (int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		scan.close();

	}

	/**
	 * 挿入ソート
	 * 
	 * @param A：オリジンの配列
	 * @param N：要素の個数
	 */
	public static void insertionSort(int[] A, int N, int g) {

		for (int i = g; i < N; i++) {
			int v = A[i]; // 1枚取り出す
			int j = i - g;
			while (j >= 0 && A[j] > v) {// 取り出した一枚より前の方に持っていたカードと比較
				A[j + g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j + g] = v;

		}

	}

	/**
	 * シェルソート
	 * @param A オリジンの配列
	 * @param N：要素の個数
	 */
	public static void shellSort(int[] A, int N) {
		for (int i = 1;; i = i * 3 + 1) {
			if (i > N) {
				break;
			}
			G[m] = i;		
			m++;
		}
		for (int i = m - 1; i >= 0; i--) {
			insertionSort(A, N, G[i]);
		}
	}

}

