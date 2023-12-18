//40分
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] n = new int[N];
		int[] P = new int[N];
		int[] Q = new int[N];

		for(int i=0; i<N; i++) {
			n[i] = i+1;
			P[i] = sc.nextInt();
		}

		for(int i=0; i<N; i++) {
			Q[i] = sc.nextInt();
		}

		int a = 0;
		//順列全探索
		for(int i=0; i<factorial(N); i++) {
			boolean allMatch = true;
			for(int j=0; j<N; j++) {
				if(n[j] != P[j]) {
					allMatch = false;
					break;
				}
			}
			if(allMatch) {
				a = i+1;
				break;
			}
			next_permutation(n, 0, n.length);
		}

		for(int i=0; i<N; i++) {
			n[i] = i+1;
		}
		int b = 0;
		for(int i=0; i<factorial(N); i++) {
			boolean allMatch = true;
			for(int j=0; j<N; j++) {
				if(n[j] != Q[j]) {
					allMatch = false;
					break;
				}
			}
			if(allMatch) {
				b = i+1;
				break;
			}
			next_permutation(n, 0, n.length);
		}

		System.out.println(Math.abs(a-b));
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
