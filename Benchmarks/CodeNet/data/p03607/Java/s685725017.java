import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			String tmp = sc.next();

			if (list.indexOf(tmp) == -1) {
				list.add(tmp);
			} else {
				list.remove(list.indexOf(tmp));
			}

		}

		System.out.println(list.size());

	}
}