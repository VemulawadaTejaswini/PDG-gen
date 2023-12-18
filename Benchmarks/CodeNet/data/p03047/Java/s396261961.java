import java.util.Scanner;

public class Main {
	static int N,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

		int ans = N - (K -1);
		System.out.println(ans);
	}
}