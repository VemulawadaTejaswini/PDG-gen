import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0536-input.txt"));

		while (scan.hasNext()) {

			int d = scan.nextInt();
			if (d == 0)
				break;
			int n = scan.nextInt();
			int m = scan.nextInt();
			Piza p = new Piza(d);
			for (int i = 1; i < n; i++)
				p.addStore(scan.nextInt());
			p.sort();
			int result = 0;
			for (int i = 0; i < m; i++)
				result += p.addDeliver(scan.nextInt());

			System.out.println(result);
		}

		scan.close();
		System.exit(0);
	}
}

class Piza {
	public Piza(int d) {
		store.add(0);
		store.add(d);
	}

	public void sort() {
		store.sort(null);
	}

	public int addDeliver(int k) {
		int i = store.size() / 2;
		int s = i / 2;
		while (true) {
			if (store.get(i) == k)
				break;
			else if (store.get(i) > k)
				i -= s;
			else if (store.get(i + 1) >= k)
				break;
			else
				i += s;
			if (s > 1)
				s /= 2;
		}
		return (Math.min(k - store.get(i), store.get(i + 1) - k));
	}

	public void addStore(int d) {
		store.add(d);
	}

	List<Integer> store = new ArrayList<Integer>();

}