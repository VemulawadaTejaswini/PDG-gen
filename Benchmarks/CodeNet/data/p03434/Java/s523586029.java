import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		a.sort(null);

		long alice = 0L;
		long bob = 0L;

		for (int i = 0; i < a.size(); i++) {
			if (i % 2 == 0) {
				// Alice
				alice += a.get(a.size() - i - 1);
			} else {
				// bob
				bob += a.get(a.size() - i - 1);
			}
		}
		System.out.println(alice - bob);

		sc.close();
	}
}
