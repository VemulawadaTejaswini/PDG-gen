import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		ArrayList<String> lines = new ArrayList<String>();
		int c = 0;

		while (true) {
			String next = sc.nextLine();

			if (next.equals("0")) {
				break;
			}
			lines.add(next);
			c++;
		}

		for (int i = 0; i < c; i++) {
			String s = lines.get(i);
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
				int in = Integer.parseInt(s.substring(j, j + 1));
				sum += in;
			}
			System.out.println(sum);
		}

	}

}