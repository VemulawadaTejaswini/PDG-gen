import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		long K = sc.nextInt();
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		if (B-A <= 2) {
			System.out.println(K+1);
			return;
		}
		
		long n = (K-A+1)/2;
		if (A-1+2*n == K) {
			System.out.println(A+(B-A)*n);
			return;
		}
		System.out.println(A+(B-A)*n + 1);
	}
}
