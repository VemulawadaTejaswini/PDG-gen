import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		A[0] = sc.nextInt();
		int temp = A[0];
		for(int i = 1; i < N; i++) {
			A[i] = sc.nextInt();
			temp = gcd(temp, A[i]);
		}
		System.out.println(temp);
		
	}
	
	static int gcd (int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}
