import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int A = s.nextInt();
			s.nextInt();
			s.nextInt();
			s.nextInt();
			final int E = s.nextInt();
			final int K = s.nextInt();

			if(E - A > K) {
				System.out.println(":(");
			} else {
				System.out.println("Yay!");
			}
		}
	}
}
