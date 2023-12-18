import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A[] = new long[5];
		long min = Long.MAX_VALUE;
		for(int i = 0; i < 5; i++) {
			A[i] = sc.nextLong();
			min = Math.min(min, A[i]);
		}
		long num[] = new long[6];
		num[0] = N;
		long ans = 5 + (N / min);
		System.out.println(ans);
	}
}
