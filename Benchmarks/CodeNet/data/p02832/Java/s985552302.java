import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(sc.next()));
		}

		ListIterator<Integer> it = a.listIterator();
		int total = 0;
		while (true) {
			int count = 0;
			while (it.hasNext()) {
				if (it.nextIndex() + 1 != it.next()) {
					it.remove();
					count++;
				}
			}
			if (count == 0) {
				System.out.println(total);
				break;
			} else {
				total += count;
				if (total == n) {
					System.out.println(-1);
					break;
				}
			}

		}

	}

}
