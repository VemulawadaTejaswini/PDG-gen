
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] line = str.replace(" ", ",").replace(".", ",").split(",");
		boolean flag = false;
		for (int i = 0; i < line.length; i++) {
			if (3 <= line[i].length() && line[i].length() <= 6) {
				if (flag) {
					System.out.print(" " + line[i]);
				} else {
					System.out.print(line[i]);
					flag = true;
				}
			}
		}
		System.out.println();
	}
}