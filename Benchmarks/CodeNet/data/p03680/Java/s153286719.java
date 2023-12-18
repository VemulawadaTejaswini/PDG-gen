import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final long n = sc.nextInt();

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		sc.close();

		boolean continueFlag = true;
		int count = 0;
		int previ = 0;
		int prevp = 0;
		while (continueFlag) {

			if (count == 0) {
				previ = a.get(0);
				count++;
				continue;
			}

			if (previ == 2) {
				continueFlag = false;
				continue;
			} else if ((prevp + 1) == a.get(previ - 1)) {
				count = -1;
				continueFlag = false;
				continue;
			} else {
				prevp = previ - 1;
				previ = a.get(previ - 1);
				count++;
			}

		}

		System.out.print(count);

	}

}