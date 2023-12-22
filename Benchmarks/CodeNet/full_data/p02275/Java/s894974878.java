import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine());

		String[] data = br.readLine().split(" ");

		int[] A = new int[n+1]; // 1 origin array
		for (int i=1; i <= n ; i++) {
			A[i] = Integer.parseInt(data[i-1]);
		}

		int k = 10_000; // Constraints

		int[] B = new int[n+1];
		countingsort(A, B, k);

		System.out.print(B[1]);
		for (int i=2; i < n+1; i++) {
			System.out.print(" " + B[i]);
		}
		System.out.println();
	}

	static void countingsort(int[] src, int[] dest, int range) {
		int[] counter = new int[range+1];
		for (int i=0; i <= range; i++) {
			counter[i] = 0;
		}

		/** counter[i] ??? i ???????????°????¨?????????? */
		for (int j=1; j < src.length; j++) {
			counter[ src[j] ]++;
		}

		/** counter[i] ??? i ??\????????°???????????°????¨?????????? */
		for (int i=1; i <= range; i++) {
			counter[i] += counter[i-1];
		}

		for (int j = src.length - 1; 1 <= j; j--) {
			dest[  counter[ src[j] ]  ] = src[j];
			counter[ src[j] ]--;
		}
	}
}