
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> a = new ArrayList<Integer>();

		int count = 0;

		for (int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}

		sc.close();

		while (true) {

			int size = a.size();

			for (int i = 0; i < size; i++) {
				if (a.get(0) % 2 != 0) {
					a.remove(0);
				}
			}

			if (a.size() == 0) {
				break;
			}

			a.set(0, a.get(0) / 2);
			count++;

		}

		System.out.print(count);
	}
}