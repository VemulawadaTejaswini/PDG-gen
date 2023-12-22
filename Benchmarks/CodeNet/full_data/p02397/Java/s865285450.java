
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String[] s = sc.nextLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);

			if (x == 0 && y == 0) {
				break;
			}
			if (x > y) {
				System.out.println(y + " " + x);
			} else {
				System.out.println(x + " " + y);
			}
		}
	}
}