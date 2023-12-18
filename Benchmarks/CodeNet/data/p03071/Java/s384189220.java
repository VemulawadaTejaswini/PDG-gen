
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int result = 0;

		if (A > B) {
			result += A;
			A--;
		} else {
			result += B;
			B--;
		}

		if (A > B) {
			result += A;
			A--;
		} else {
			result += B;
			B--;
		}

		System.out.println(result);
	}
}
