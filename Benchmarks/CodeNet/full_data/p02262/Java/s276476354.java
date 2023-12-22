import java.util.Scanner;

public class Main {
	public static int cnt = 0;
	public static int m = 0;
	public static int[] G = new int[100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] array = new int[num];
		for(int i = 0;i < num;i++){
			array[i] = scan.nextInt();
		}
		shellSort(array,num);
		System.out.println(m);
		System.out.print(G[0]);
		for(int i = 1; G[i] != 0;i++){
		System.out.print(" "+G[i]);
		}
		System.out.println();
		System.out.println(cnt);
		for(int i = 0; i < num ;i++){
			System.out.println(array[i]);
		}
		
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
			// for (int k = 0; k < N; k++) {
			// if (k == N - 1) {
			// System.out.print(A[k]);
			// } else {
			// System.out.print(A[k] + " ");
			// }
			// }
			// System.out.println("");
		}

	}

	
	public static void insertionSort2(int[] A, int N, int g){
		for(int i = 1; i < N; i++){
			int insertionData = A[i];
			int j = i;
			for(; j >= 1 && A[j - 1] > insertionData; j--){
				A[j] = A[j - 1];
				cnt++;
			}
			A[j] = insertionData;
		}
		//System.out.println(Arrays.toString(array));

	}
	
	
	public static void insertionSort3(int[] A, int N, int g){
		for(int i = g; i < N; i++){
			int insertionData = A[i];
			int j = i -g;
			for(; j >= 1 && A[j - 1] > insertionData; j--){
				A[j] = A[j - 1];
				cnt++;
			}
			A[j] = insertionData;
		}
		//System.out.println(Arrays.toString(array));

	}
	
	// http://judge.u-aizu.ac.jp/onlinejudge/review.jsp?rid=2041983#1
	public static void shellSort(int[] A, int N) {
		cnt = 0;
		m = 0;
		// G[] = {?,?}
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

	public static void shellSort2(int[] A,int N){
		
		for (int range = A.length / 2; range > 0; range /= 2) {
			m++;
			// 間隔内での移動
			for (int h = 0; h < m-1; h++) {
				// ここから挿入法
				// ソート対象データは間隔ごとの要素になるのでループの増分値はi += range
				insertionSort2(A,N,range);
			}
		}

		
	}
}

