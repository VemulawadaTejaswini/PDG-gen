import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] a = new long[n];
		long sum = 1;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		
		
		
		for(int i = 0; i < n; i++) {
			sum*= a[i];
			if(sum < 0 || sum > (long)Math.pow(10, 18)) {
				sum = -1;
				break;
			}
		}
		
		
		
		if(sum <= (long)Math.pow(10, 18) && sum >= 0) {
			System.out.println(sum);
		}else {
			System.out.println(-1);
		}
		
		
		
	}
}