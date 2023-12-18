
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		return N * A < B ? N * A : B;
	}
}
