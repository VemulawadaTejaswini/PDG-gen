import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			if (line == "-")
				break;
			int m = sc.nextInt();
			int n = line.length();

			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				String a = line.substring(0, h);
				String b = line.substring(h);
				line = b + a;
			}
			System.out.println(line);
		}
	}
}