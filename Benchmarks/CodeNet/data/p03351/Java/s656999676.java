import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int diffAC = a > c ? a-c : c-a;
		int diffBC = b > c ? b-c : c-b;
		int diffAB = a > b ? a-b : b-a;

		System.out.println(check(diffAB, diffAC, diffBC, d));

	}

	public static String check(int diffAB, int diffAC, int diffBC, int d) {
		if (diffAC <= d) {
			return "Yes";
		}
		if (diffAB <= d && diffBC <= d) {
			return "Yes";
		}
		return "No";
	}
}
