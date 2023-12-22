import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//入力値の取得
		int N = sc.nextInt();
		int[] A = new int[N];
		long sum = 0;
		long tmp = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();

			//2番目以降の合計値
			if(i > 0) {
				tmp = add(tmp,A[i]);
			}
		}

		//計算
		for(int i=0; i < N-1; i++) {
			sum = add(sum, multiple(A[i],tmp));
			tmp -= A[i+1];
		}

		System.out.print(sum);
	}

	private static long multiple(long A, long B) {
		long ans = 0;
		ans = (A%1000000007) * (B%1000000007);
		return ans;
	}

	private static long add(long A, long B) {
		long ans = 0;
		ans = (A%1000000007) + (B%1000000007);
		return ans;
	}
}
