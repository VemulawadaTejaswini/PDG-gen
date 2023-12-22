import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(gcd(A, B));
		}
	}

	static int gcd(int A, int B) {
		return A % B == 0 ? B : gcd(B, A % B);
	}

}