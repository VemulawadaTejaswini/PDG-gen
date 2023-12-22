
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int ten = 0;
			int out = 0;
			int run = 0;
			while (out < 3) {
				String line = scanner.next();
				if (line.equals("HIT")) {
					if (run == 3)
						ten++;
					else
						run++;
				} else if (line.equals("HOMERUN")) {
					ten += run + 1;
					run = 0;
				} else {
					out++;
				}
			}
			System.out.println(ten);
		}

	}

}