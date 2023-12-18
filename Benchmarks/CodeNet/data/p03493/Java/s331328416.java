
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		sc.close();
		int count = 0;

		for (int i = 0; i < 3; i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		System.out.print(count);
	}
}
