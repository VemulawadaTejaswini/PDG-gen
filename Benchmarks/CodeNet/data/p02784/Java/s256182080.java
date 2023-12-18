import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static String solve() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < A; i++) {
			sum += sc.nextInt();
		}
		
		return sum >= H ? "Yes" : "No";
	}
}
