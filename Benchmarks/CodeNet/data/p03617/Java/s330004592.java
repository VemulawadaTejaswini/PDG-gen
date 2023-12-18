import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long Q = sc.nextLong();
		long H = sc.nextLong();
		long S = sc.nextLong();
		long D = sc.nextLong();
		long N = sc.nextLong();

		System.out.println((N/2) * Math.min(Math.min(Math.min(H, Q * 2) * 2,S)*2,D)+(N % 2) * Math.min(Math.min(H, Q * 2) * 2,S));

	}
}
