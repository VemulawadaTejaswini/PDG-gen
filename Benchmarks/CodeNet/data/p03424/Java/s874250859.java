import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		List<String> arareList = new ArrayList<String>();

		int count = 0;
		for (int i = 0; i < n; i++) {

			final String arare = sc.next();
			if (!arareList.contains(arare)) {
				arareList.add(arare);
				count++;
			}
		}

		String result = null;
		if (count == 3) {
			result = "Tree";
		} else if (count == 4) {
			result = "Four";
		}

		System.out.println(result);

	}

}
