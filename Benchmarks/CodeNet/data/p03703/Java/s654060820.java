import java.util.*;

public class TaskE { // Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long k = scanner.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i ++) {
			a[i] = scanner.nextLong() - k;
		}
		long[] sum = new long[n];
		int count = 0;
		for(int i = 0; i < n; i ++) {
			sum[i] = a[i];
			if(sum[i] >= 0) {
				count ++;
			}
			for(int j = i + 1; j < n; j ++) {
				sum[j] = sum[j-1] + a[j];
				if(sum[j] >= 0) {
					count ++;
				}
			}
		}
		System.out.println(count);
				
		scanner.close();
	}
}