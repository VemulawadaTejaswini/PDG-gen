import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();
		System.out.println(checkCat(A,B,X));

	}

	public static String checkCat(int A, int B, int X) {
		if (A + B  <= X) {
			return "No";
		}
		if (A >= X) {
			return "No";
		}
		return "Yes";
	}
}
