import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		List<String> list = new ArrayList<>();
		String s = null;

		long cnt = 0;
		sc.nextLine();

		for (int i = 0; i < n; i++) {

			s = sc.nextLine();
			if (list.contains(s)) {
				continue;
			} else {
				list.add(s);
			}

		}

		System.out.println(list.size());

	}

}
