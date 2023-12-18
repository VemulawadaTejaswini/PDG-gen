import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int C = Integer.parseInt(tokens[2]);
		int resultA = 10 * A + B + C;
		int resultB = A + 10 * B + C;
		int resultC = C * 10 + A + B;
		System.out.println(Math.max(Math.max(resultA, resultB), resultC));
		in.close();
	}
}