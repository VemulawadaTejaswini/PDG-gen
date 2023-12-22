import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//個数読み込み
		int N = sc.nextInt();

		//配列用意
		int A[] = new int[N];

		//読み込み
		for(int i =0; i<N; i++) {
			A[i]=sc.nextInt();
			A[i]%= 1000000007;
		}

		//答え
		long ans = 0;

		long sum = 0;

		for(int i=0; i<N; i++) {
			sum += A[i];
		}

		sum%= 1000000007;

		//a*b + a*c + a*c = a*(b+c+d)であることを利用する(結合法則）
		for(int i =0; i < N-1; i++) {

			sum -= A[i];

			//オーバーフローを防ぐため、modの分配法則を利用する
			ans += (A[i]*sum);
			ans %= 1000000007;
		}


		System.out.println(ans);
		sc.close();
	}
}
