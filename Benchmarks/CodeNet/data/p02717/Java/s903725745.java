import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int save = 0;

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();

		save = x;
		x = y;
		y = save;

		save = z;
		z = x;
		x = save;
		
		System.out.println(x + " " + y + " " + z);

		scanner.close();

	}

}