import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String output = "No";

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();

		if((n%500)<=a)
			output = "Yes";

		System.out.println(output);

	}

}
