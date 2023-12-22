import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}

		// Gは狭めていく挿入ソートの間隔を要素として持つ配列
		int[] G = new int[15];
		int m = 0;
		for(int i = 1; i <= N; i = i*3+1) {
			G[m] = i;  //シェルソートの幅はこれが良いとされているらしい
			m++;
		}

		// 出力
		System.out.println(m);
		System.out.print(G[m-1]);
		for(int i = m-2; i >= 0; i--) {
			System.out.print(" " + G[i]);
		}
		System.out.println();
		System.out.println(shellSort(array, N, m, G));
		for(int i = 0; i < N; i++) {
			System.out.println(array[i]);
		}

		sc.close();
	}

	// 一定間隔gごとに挿入ソート
	private static int insertionSort(int[] a, int n, int g) {
		int cnt = 0;
		for(int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;
			while(j >= 0 && a[j] > v) {
				a[j+g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j+g] = v;
		}
		return cnt;
	}

	public static int shellSort(int[] a, int n, int m, int[] G) {
		int cnt = 0;
		for(int i = m-1; i >= 0; i--) {
			cnt += insertionSort(a, n, G[i]);
		}
		return cnt;
	}
}
