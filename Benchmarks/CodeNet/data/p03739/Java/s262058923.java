import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long x = 0;
		long sum = a[0];
		if(sum <= 0) {
			x = 1 - sum;
			sum = 1;
		}
		
		long x1 = seq(sum, x, a);
		
		x = 0;
		long sum2 = a[0];
		if(sum2 >= 0) {
			x = sum2 + 1;
			sum2 = -1;
		}
		
		long x2 = seq(sum2, x, a);
		
		System.out.println(Math.min(x1, x2));
	}
	
	public static long seq(long sum, long x, long[] a) {
		long count = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(sum * (sum + a[i]) >= 0) {
				if(sum < 0) {
					count = -sum - a[i] + 1;
				} else {
					count = -sum - a[i] - 1;
				}
			}
			sum += a[i] + count;
			x += Math.abs(count);
			count = 0;
		}
		return x;
	}
	
}
