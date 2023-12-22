import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ABC170-D
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}

		int count = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (a.get(i) % a.get(j) == 0 && a.get(i) != a.get(j)) {
					break;
				}
				if (j == N - 1 && a.get(i) != a.get(j)) {
					count++;
				}
			}
		}

		System.out.println(count);
		sc.close();
	}
}
