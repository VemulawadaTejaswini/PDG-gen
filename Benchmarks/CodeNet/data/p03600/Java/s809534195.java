import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long[][] A = new long[N][N];
		long ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				A[i][j] = sc.nextLong();
				if(i > j)
					ans += A[i][j];
			}
		}

		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					//別の経由地を通ったほうが距離が短くなる場合
					if(A[i][j] > A[i][k] + A[k][j]) {
						System.out.println(-1);
						return;
					}
					//別の経由地を通っても最短距離になる場合
					else if(i > j && i != k && j != k && A[i][j] == A[i][k] + A[k][j]) {
						ans -= A[i][j];
					}
				}
			}
		}

//		//無向グラフなので2で割る
//		ans /= 2;

		System.out.println(ans);

	}

}
