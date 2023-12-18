import java.util.*;

public class Main {
	static long A[] = new long[87];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(l(N));
	}
	
	public static long l(int n) {
		if (A[n] != 0) {
			return A[n];
		}
		
		long ans;
		if (n == 0) {
			ans = 2;
		} else if (n == 1) {
			ans = 1;
		} else {
			ans = l(n - 2) + l(n - 1);
		}
		A[n] = ans;
		
		return ans;
	}
}