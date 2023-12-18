
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static String solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		return N > M ? "No" : "Yes";
	}
}
