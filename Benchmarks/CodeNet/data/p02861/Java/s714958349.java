//30分
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] n = new int[N];
		int[] x = new int[N];
		int[] y = new int[N];

		for(int i=0; i<N; i++) {
			n[i] = i;
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		double sum = 0;
		//順列全探索
		for(int i=0; i<factorial(N); i++) {
			for(int j=0; j<N-1; j++) {
				sum += Math.sqrt((x[n[j]] - x[n[j+1]])*(x[n[j]] - x[n[j+1]]) + (y[n[j]] - y[n[j+1]])*(y[n[j]] - y[n[j+1]]));
			}
			next_permutation(n, 0, n.length);
		}

		double ans = sum / factorial(N);

		System.out.println(ans);
	}

	//階乗
	static int factorial(int n) {
		if(n == 1)
			return 1;

		return n * factorial(n-1);
	}

	//次の順列を生成する
	static boolean next_permutation(int[] array, int start, int end) {

		if(array == null || start > end || start < 0 || end > array.length) {
			System.out.println("Error: 引数が正しくありません。");
			return false;
		}

		for(int i=end-2; i>=start; i--) {
			if(array[i] < array[i+1]) {
				int j = end - 1;
				while(array[i] >= array[j]) {
					j--;
				}

				//swap
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;

				Arrays.sort(array, i+1, end);

				return true;
			}
		}

		return false;
	}

}
