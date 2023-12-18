import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int m = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		boolean duplicateFlag = false;
		for (int i = 0; i < m; i++) {
			list.add(sc.nextInt());
			if (i > 0 && (list.get(i) - list.get(i - 1)) == 1) {
				System.out.print(0);
				duplicateFlag = true;
				break;
			}

		}

		if (duplicateFlag) {
			return;
		}

		final int n2 = n / 2;

		System.out.print((n2 + 1) % 1000000007);

	}

}