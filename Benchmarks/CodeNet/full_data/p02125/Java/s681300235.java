import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve3027();
	}

	public static void solve3027() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String binary = Integer.toBinaryString(N);
		int binaryNumDigits = binary.length();

		int ans = binary.contains("0") ? binaryNumDigits - 1 : binaryNumDigits;
		System.out.println(ans);

		sc.close();
	}
}

