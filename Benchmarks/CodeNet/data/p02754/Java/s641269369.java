import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N, A, B;
		N = sc.nextLong();
		A = sc.nextLong();
		B = sc.nextLong();
		sc.close();
		long a = N / (A + B);

		if (N % (A + B) == 0) {
			long b = a;
			System.out.println(A * b);
		} else {
			long b = a + 1;
			long c = b * (A + B);
			if (c > N) {
				c = c - B;
				if (c > N) {
					c = c - N;
					c=A-c;
					System.out.println(A * (b-1) + c);
				} else {
					System.out.println(A * b);
				}
			}
		}
	}
}
