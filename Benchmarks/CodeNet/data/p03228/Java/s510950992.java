import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		int K = in.nextInt();
		for (int i = 0; i < K; ++i) {
			if (i % 2 == 0) {
				if (A % 2 == 1) {
					A = A - 1;
				}
				A /= 2;
				B += A;
			} else {
				if (B % 2 == 1) {
					B -= 1;
				}
				B /= 2;
				A += B;
			}
		}
		System.out.println(A + " " + B);
		in.close();
	}
}