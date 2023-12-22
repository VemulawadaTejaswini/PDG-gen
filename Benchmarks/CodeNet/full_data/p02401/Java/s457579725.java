import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		String[] n;

		while (true) {

			String line = sc.nextLine();
			n = line.split(" ");

			if (n[1].equals("?")) {
				break;
			}

			int a = Integer.parseInt(n[0]);
			int b = Integer.parseInt(n[2]);
			if (n[1].equals("+")) {
				result.add(a + b);
			} else if (n[1].equals("-")) {
				result.add(a - b);
			} else if (n[1].equals("*")) {
				result.add(a * b);
			} else if (n[1].equals("/")) {
				result.add(a / b);

			}

		}// whileここまで
		for (Integer i : result) {
			System.out.println(i);

		}

	}

}

