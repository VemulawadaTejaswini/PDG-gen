import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		List<String> klist = new ArrayList<String>();
		String line = sc.nextLine();
		while (true) {
			String line2 = sc.nextLine();
			klist.add(line2);
			if (line2.equals("END_OF_TEXT")) {
				break;
			}
		}
		int count = 0;
		for (String string : klist) {
			String[] k = string.split(" ");

			for (int j = 0; j < k.length; j++) {
				if (k[j].equalsIgnoreCase(line)) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}