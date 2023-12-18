import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			int all = 0;
			List<Integer> list = new ArrayList<>();
			list.add(a);
			list.add(b);
			list.add(c);

			Collections.sort(list);
			all += Math.abs(a - b);
			all += Math.abs(b - c);

			System.out.println(all);

		}
	}
}
