import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());

			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);

			System.out.println(list.get(list.size() - 1) - list.get(0));
		} finally {
			sc.close();
		}
	}
}