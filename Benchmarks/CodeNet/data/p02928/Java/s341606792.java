import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		long K = stdIn.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
		}
		
		long count1 = 0;
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(A[i]>A[j]) count1++;
			}
		}
		count1 *= K;
		
		long count2 = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(A[i]>A[j]) count2++;
			}
		}
		count2 *= (K*(K-1)/2)%1000000007;
		
		System.out.println((count1%1000000007+count2%1000000007)%1000000007);

	}

}