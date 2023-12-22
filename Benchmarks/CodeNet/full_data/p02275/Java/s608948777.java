import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		Scanner sc = new Scanner(System.in);

//		int n = Integer.parseInt(br.readLine());
		int n = sc.nextInt();

//		String[] A = br.readLine().split(" ");
		int[] A = new int[n];
		for (int i=0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		sc.close();

//		int[] A = new int[n+1]; // 1 origin array
//		for (int i=1; i <= n ; i++) {
//			A[i] = Integer.parseInt(data[i-1]);
//		}

		int k = 10_000; // Constraints

		int[] B = new int[n+1];
//		countingsort(A, B, k);

		int[] C = new int[k+1];

		for (int j=0; j < n; j++) {
//			C[ Integer.parseInt(A[j]) ]++;
			C[ A[j] ]++;
		}

		for (int i=1; i <= k; i++) {
			C[i] += C[i-1];
		}

		for (int j = n-1; 0 <= j; j--) {
//			B[  C[ Integer.parseInt(A[j]) ]  ] = Integer.parseInt(A[j]);
			B[  C[ A[j] ]  ] = A[j];
//			C[ Integer.parseInt(A[j]) ]--;
			C[ A[j] ]--;
		}

		StringBuilder sb = new StringBuilder();
		for (int i=1; i <= n-1; i++) {
			sb.append(B[i] + " ");
		}
		sb.append(B[n]);
		System.out.println(sb);
	}

//	static void countingsort(int[] src, int[] dest, int range) {
//		int[] counter = new int[range+1];
////		for (int i=0; i <= range; i++) {
////			counter[i] = 0;
////		}
//
//		/** counter[i] ??? i ???????????°????¨?????????? */
//		for (int j=1; j < src.length; j++) {
//			counter[ src[j] ]++;
//		}
//
//		/** counter[i] ??? i ??\????????°???????????°????¨?????????? */
//		for (int i=1; i <= range; i++) {
//			counter[i] += counter[i-1];
//		}
//
//		for (int j = src.length - 1; 1 <= j; j--) {
//			dest[  counter[ src[j] ]  ] = src[j];
//			counter[ src[j] ]--;
//		}
//	}
}