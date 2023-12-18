import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int alice = 0;
		int bob = 0;
		List<Integer> x = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String cards = sc.nextLine();
		String dc[] = cards.split(" ");
		for (int i = 0; i < N; i++) {
			x.add(Integer.parseInt(dc[i]));
		}
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		Collections.sort(x, c);
		for (int j = 0; j < N; j++) {
			if (!x.isEmpty()) {
				alice += x.get(0);
				x.remove(0);
			}
			if (!x.isEmpty()) {
				bob += x.get(0);
				x.remove(0);
			}
		}
		System.out.println(alice - bob);
	}
}