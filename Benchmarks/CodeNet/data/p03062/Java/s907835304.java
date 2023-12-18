import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] A = new long[N];
		int a = -1;
		int sum = 0;
		int sum0 = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] < 0) {
				a = i;
				sum++;
			} else if(A[i] == 0) {
				sum0++;
			}
		}
		
		long total = 0;
		long b = -A[a];
		
		if(sum % 2 == 0) {
			for(int i = 0; i < N; i++) {
				total += Math.abs(A[i]);
			}
		} else {
			for(int i = 0; i < a; i++) {
				total += Math.abs(A[i]);
			}
			for(int i = a; i < N; i++) {
				 b = Math.min(b, Math.abs(A[i]));
				 total += Math.abs(A[i]);
			}
			if(sum0 > 0) {
				total = total;
			} else {
				total -= 2 * b;
			}
		}
		System.out.println(total);
	}
}
