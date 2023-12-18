import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		int cnt = 0;

		List<Integer> list = new ArrayList<>();
		while (sc.hasNext()) {
			int temp = sc.nextInt();
			list.add(temp);
			sum += temp;
		}

		for (int a : list) {
			if (a * 4 * m < sum) {
				continue;
			}
			cnt++;
		}

		if (m <= cnt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
