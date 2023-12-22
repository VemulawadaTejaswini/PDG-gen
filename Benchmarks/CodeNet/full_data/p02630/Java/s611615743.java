import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //N個の自然数

		int[] A = new int[N]; //N個の数列A
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int Q = sc.nextInt(); //操作を行う回数

		int[][] BC = new int[2][Q]; //BとCを格納する配列
		for(int i=0; i<Q; i++) {
			BC[0][i] = sc.nextInt(); //Bを格納
			BC[1][i] = sc.nextInt(); //Cを格納
		}

		long[] S = new long[Q]; //出力用の数列S

		for(int i=0; i<Q; i++) {
			for(int j=0; j<N; j++) {
				if(BC[0][i] == A[j]) {
					A[j] = BC[1][i];
				}
				S[i] += A[j];
			}
			System.out.println(S[i]);
		}
	}
}
