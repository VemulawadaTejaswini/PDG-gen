import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), K = sc.nextLong();
		long[] H = new long[100005];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		Arrays.sort(H);
//		System.out.println(Arrays.toString(H));
//		for(int i = 100004; i >=0 ; i--) {
//			System.out.print(H[i]);
//			System.out.print(" ");
//		}
//		System.out.println();
		long sum = 0;
		if(N > K) {
			for(int i = (int)(100005 - K - 1); i >= 100005 - N; i--) {
				sum += H[i];
			}
		}
		System.out.print(sum);
		
		sc.close();
		
	}
}
