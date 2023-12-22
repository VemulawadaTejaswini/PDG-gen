import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String[] line = new String[10000];
		for (int i = 0; i < line.length; i++) {
			line[i] = sc.nextLine();
			if (line[i].equals("0")) {
				break;
			}
		}
		for (int i = 0; i < line.length; i++) {
			if (line[i].equals("0")) {
				break;
			}
			System.out.println("Case " + i + 1 + ": " + line[i]);
		}

	}
}