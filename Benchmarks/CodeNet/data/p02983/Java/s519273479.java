import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int L = sc.nextInt();
		int R = sc.nextInt();

		sc.close();

		int i = L;

		int j = Math.min(L + (2019 * 2), R);

		List<Integer> a = new ArrayList<>();
		for (int x = i; x <= j; x++) {
			a.add(x % 2019);
		}

		a.sort(Comparator.naturalOrder());

		out.println(a.get(0) * a.get(1));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
