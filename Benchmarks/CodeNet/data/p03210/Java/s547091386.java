import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		if (X == 7 || X == 5 || X == 3)
			System.out.println("YES");
		else
			System.out.println("NO");
		scanner.close();
	}
}