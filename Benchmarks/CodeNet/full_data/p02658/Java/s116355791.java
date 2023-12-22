
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] a = new long[n];
		long sum = 1;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if(Math.pow((double)sum, 1.0/10.0) + Math.pow((double)a[i], 1.0/10.0) > 18.0) {
				sum = -1;
				break;
			}
			sum *= a[i];
		}
		if(sum <= (long)Math.pow(10, 18) && sum >= 0) {
		System.out.println(sum);
		}else {
			System.out.println(-1);
		}
	}
}
