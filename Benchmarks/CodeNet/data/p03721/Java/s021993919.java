import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			for (int j = 0; j < b; j++) {
				list.add(a);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(k-1));
		scanner.close();
	}
}
