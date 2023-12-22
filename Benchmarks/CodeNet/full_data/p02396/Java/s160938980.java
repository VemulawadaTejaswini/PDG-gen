import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String[] line = new String[10001];
		for (int i = 0; i < line.length; i++) {
			line[i] = sc.nextLine();
			if (line[i].equals("0")) {
				break;
			}
		}
		for (int i = 1; i < line.length; i++) {
			if (line[i - 1].equals("0")) {
				break;
			}
			int v = Integer.parseInt(line[i - 1]);
			System.out.println("Case " + i + ": " + v);
		}

	}
}