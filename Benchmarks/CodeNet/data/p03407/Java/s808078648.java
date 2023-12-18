import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();

		String reslut = "No";
		if ((a + b) >= c) {
			reslut = "Yes";
		}

		System.out.println(reslut);
	}

}
