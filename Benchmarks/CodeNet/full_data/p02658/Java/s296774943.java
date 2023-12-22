import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] a = new long[n];
		long sum = 1;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			sum *= a[i];
			if(sum > (long)Math.pow(10, 18)) {
				break;
			}
		}
		if(sum <= (long)Math.pow(10, 18)) {
		System.out.println(sum);
		}else {
			System.out.println(-1);
		}
	}
}
