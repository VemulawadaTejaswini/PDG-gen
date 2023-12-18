import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int n = 2;
		
		System.out.println(lcm(N, n));

	}
  
	static int gcd(int N, int n) {
		return n > 0 ? gcd(n, N%n) : N;
	}
	
	public static int lcm(int N, int n) {
		return N * n / gcd(N, n);
	}

}