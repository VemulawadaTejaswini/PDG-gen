import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		long A[] = new long[N];
		int B[] = new int[M];
		long C[] = new long[M];

		for( int i = 0 ; i < N ; i ++ ) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		for( int i = 0 ; i < M ; i ++ ) {
			B[i] = sc.nextInt();
			C[i] = sc.nextLong();

			int changeCount = 0 ;
			for(int idx = 0 ; idx < N ; idx ++ ) {
				if(A[idx] < C[i]) {
					if(changeCount < B[i]) {
						A[idx] = C[i] ;
						changeCount ++ ;
					}else {
						break;
					}
				}else {
					break;
				}
			}
			if(0 < changeCount) {
				Arrays.sort(A);
			}
//			for( int idx = 0 ; idx < N ; idx ++ ) {
//				System.out.print("A[" + (idx+1) + "]=" + A[idx] + " ");
//			}
//			System.out.println();
		}
		long sum = 0 ;
		for( int i = 0 ; i < N ; i ++ ) {
			sum +=A[i];
		}
		System.out.println(sum);
//		System.out.println("N =" + N + ",M=" + M );
//		for( int i = 0 ; i < N ; i ++ ) {
//			System.out.println("A[" + (i+1) + "]=" + A[i] );
//		}
//		for( int i = 0 ; i < M ; i ++ ) {
//			System.out.println("B[i] =" + B[i] + ",C[i]=" + C[i] );
//		}

	}

}
