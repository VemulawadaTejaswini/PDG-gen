import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		
		long[] B = new long[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		Arrays.sort(B);
		
		long[] C = new long[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextLong();
		}
		Arrays.sort(C);
		
		long ans = 0;
		for (int a = 0; a < N; a++) {
			int Bi = Arrays.binarySearch(B, A[a]+1);
			Bi = optimaizIndex(N, Bi);
			
			if (Bi >= N)
				break;
			
			//重複していた場合先頭に戻す
			for (int orverlapTrimBi = Bi; orverlapTrimBi > 0; orverlapTrimBi--) {
				if (B[orverlapTrimBi] != B[orverlapTrimBi - 1]) break;
				else 
					Bi = orverlapTrimBi - 1;
			}
			
			for (int j = Bi; j < N; j++) {
				int Ci = Arrays.binarySearch(C, B[j]+1);
				Ci = optimaizIndex(N, Ci);
				
				if (Ci >= N)
					break;
				
				//重複していた場合先頭に戻す
				for (int orverlapTrimCi = Ci; orverlapTrimCi > 0; orverlapTrimCi--) {
					if (C[orverlapTrimCi] != C[orverlapTrimCi - 1]) break;
					else 
						Ci = orverlapTrimCi - 1;
				}
				
				ans += N - Ci;
			}
			

		}
		
		System.out.println(ans);
	}
	
	public static int optimaizIndex(int N, int binaryIndex) {
		if (binaryIndex >= 0) {
			return binaryIndex;
		}
		
		if (binaryIndex == -N - 1) {
			return N;
		}
		
		return Math.abs(binaryIndex + 1);
	}
}