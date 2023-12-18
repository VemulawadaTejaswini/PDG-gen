import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N, K;
		N = sc.nextLong();
		K = sc.nextLong();
		System.out.println(Math.min(N%K, N%-K));
	}
}