import java.util.*;

public class Main {
	
	private static void checkBalance(int A, int B, int C, int D) {

		int L = A + B;
		int R = C + D;

		if (L > R) {
			System.out.println("Left");
		} else if (L < R) {
			System.out.println("Right");
		} else {
			System.out.println("Balanced");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();

		checkBalance(A, B, C, D);
	}


}