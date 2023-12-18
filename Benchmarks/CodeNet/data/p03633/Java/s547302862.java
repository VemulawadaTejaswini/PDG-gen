import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] T = new long[N];
		
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
		}
		
		Arrays.sort(T);
		long t = 0;
		
		loop:
		for(long i = T[N - 1]; i <= Math.pow(10, 18); i += T[N - 1]) {
			for(int j = N - 1; j >= 0; j--) {
				if(i % T[j] != 0) {
					break;
				}
				if(j == 0) {
					t = i;
					break loop;
				}
			}
		}
		System.out.println(t);
	}
}
