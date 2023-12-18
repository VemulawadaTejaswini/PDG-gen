import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			List<Integer> a = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				a.add(sc.nextInt());

			}

			for (int i = 0; i < n; i++) {
				int temp = a.get(0);
				a.remove(0);
				System.out.println(Collections.max(a));
				a.add(temp);

			}

		}

	}

}
