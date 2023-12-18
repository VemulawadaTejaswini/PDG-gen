import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		List<Integer> mochiList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			mochiList.add(sc.nextInt());
		}

		Collections.sort(mochiList);

		int prevmochi = 0;
		int result = 0;
		for (final int mochi : mochiList) {
			if (mochi == prevmochi) {
				prevmochi = mochi;
				continue;
			} else {
				prevmochi = mochi;
				result++;
			}
		}

		if (mochiList.get(0) == mochiList.get(mochiList.size() - 1)) {
			result = 0;
		}

		System.out.print(result);

	}

}
