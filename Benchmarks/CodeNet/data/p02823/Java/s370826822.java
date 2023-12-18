import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		if (Math.abs(A - B - 1) % 2 == 1) {
			System.out.println(Math.abs((A - B) / 2));
		} else {
			if (A < Math.abs(N-B)) {
				//0が近い
				long dist = A;
				System.out.println(dist + (B - dist)/2);
			} else {
				//Nが近い
				long dist = Math.abs(N-B) + 1;
				System.out.println(dist + (N - (A + dist))/2 - 1);
			}
		}

	}
}