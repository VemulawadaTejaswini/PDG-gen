
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner rs = new Scanner(System.in);
		int a = 0;
		while (rs.hasNext()) {
			String line = rs.nextLine();
			Scanner cs = new Scanner(line);
			int h = cs.nextInt();
			if (a < h) {
				a = h;
			}
		}
		System.out.println(a);
	}
}