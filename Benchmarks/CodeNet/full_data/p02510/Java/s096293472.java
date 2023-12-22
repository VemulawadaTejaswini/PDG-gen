import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("line?");
			String line = sc.next();
			if (line == "-")
				break;

			System.out.println("m?");
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				System.out.println("h?");
				int h = sc.nextInt();
				line = line.substring(h) + line.substring(0, h);
			}
			System.out.println(line);
		}
	}
}