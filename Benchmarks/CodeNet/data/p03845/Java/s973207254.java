import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		List<Integer> list = new ArrayList<>();
		while (n > 0) {
			int in = Integer.parseInt(sc.next());
			list.add(in);
			n--;
		}

		int drinknum = Integer.parseInt(sc.nextLine());

		while (drinknum > 0) {
			int m = Integer.parseInt(sc.next());
			int l = Integer.parseInt(sc.next());

			list.set(m, l);
			int all = 0;
			for (Integer i : list) {
				all += i;
			}

			System.out.println(all);

			drinknum--;
		}

		sc.close();
	}
}
