import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * A - BBQ Easy
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 2*n; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		int x = 0;
		for (int i = 0; i < n; i++) {
			x += list.get(i*2);
		}
		System.out.println(x);
	}
}
