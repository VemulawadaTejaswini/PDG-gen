import java.util.*;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		String result;

		if (A == B && A != C || A == C && A != B || B == C && A != B) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}