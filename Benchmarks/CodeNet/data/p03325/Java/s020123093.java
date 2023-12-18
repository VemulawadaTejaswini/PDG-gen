import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		System.out.println(threeOrTwo(n, list));
		sc.close();
	}

	public static int threeOrTwo(int n, ArrayList<Integer> list) {
		int count = 0;
		while (true) {
			int odd = 0;
			int even = 0;
			for (int i = 0; i < n; i++) {
				if (list.get(i) % 2 == 0 && even == 0) {
					list.set(i, list.get(i) / 2);
					even++;
				} else {
					list.set(i, list.get(i) * 3);
					odd++;
				}
			}
			if (odd == n) {
				return count;
			} else {
				count++;
			}
		}
	}
}