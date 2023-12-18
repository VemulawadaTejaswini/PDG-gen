import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inX = stdin.nextInt();
		int inA = stdin.nextInt();
		int inB = stdin.nextInt();

		System.out.println((inX - inA) % inB);
	}

}
