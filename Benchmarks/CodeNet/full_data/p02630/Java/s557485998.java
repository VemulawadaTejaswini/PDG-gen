import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//input
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

		//メイン処理
		long[] S = new long[Q]; //出力用の数列S
		int[] list = new int[100001];
		HashSet<Integer> mark = new HashSet<Integer>();

		for(int i=0; i<N; i++) {
			list[A[i]]++;
			mark.add(A[i]);
		}

		for(int i=0; i<Q; i++) {
			list[BC[1][i]] += list[BC[0][i]];
			list[BC[0][i]] = 0;
			mark.remove(BC[0][i]);
			mark.add(BC[1][i]);
			for(int value : mark) {
				S[i] += list[value]*value;
			}
			System.out.println(S[i]);
		}
	}

}
