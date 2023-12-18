//unsolved
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long A[] = new long[N];	for(int i = 0; i < N; i++) {A[i] = sc.nextLong();}
		long F[] = new long[N];	for(int i = 0; i < N; i++) {F[i] = sc.nextLong();}
		Arrays.sort(A);
		Arrays.sort(F);
		long min = 0;
		long max = (long)Math.pow(10, 12);
		while(max > min) {
			long used = 0;
			long mid = (min + max)/2;
			for(int i = 0; i < N; i++) {
				if(mid/F[N-1-i] < A[i]) {
					used += A[i] - mid/F[N-1-i]; 
				}
			}
			if(used > K) {
				min = mid + 1;
			}else {
				max = mid;	
			}
		}
		System.out.println(min);
		sc.close();
	}
}