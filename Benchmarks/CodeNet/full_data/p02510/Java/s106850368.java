import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String ans;
			String line = sc.next();
			if (line.equals("-")) {
				break;
			} else {
				int m = sc.nextInt();
				for (int i = 0; i < m; i++) {
					int h = sc.nextInt();
					ans = line.substring(h) + line.substring(0, h);
					line = ans;
				}
				System.out.println(line);
			}
		}
	}
}