import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for (int i = 0; i < n; i++) {
			long l = sc.nextLong();
			
			if (l == 0) {
				System.out.println(0);
				return;
			} else {
				a[i] = l;
			}
		}
		
		long prod = 1;
		
		for (int i = 0; i < n; i++) {
			if (a[i] <= (long)Math.pow(10, 18) / prod) {
				prod *= a[i];
			} else {
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(prod);
		
		sc.close();
	}
}


