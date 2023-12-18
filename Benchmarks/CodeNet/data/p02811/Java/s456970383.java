import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int X = in.nextInt();
		if (K * 500 >= X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}
}