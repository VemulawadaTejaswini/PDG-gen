import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long sum = a[0];
		long x = 0;
		
		if(a[0] == 0) {
			if(a[1] >= 0) {
				sum = -1;
				x++;
			} else {
				sum = 1;
				x++;
			}
		}
		
		long count = 0;
		
		for(int i = 1; i < n; i++) {
			if((sum < 0 && sum + a[i] <= 0) || (sum > 0 && sum + a[i] >= 0)) {
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
		System.out.println(x);
	}
}
