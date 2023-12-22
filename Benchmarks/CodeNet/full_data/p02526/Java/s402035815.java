import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> s = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}

		int count = 0;
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			if (s.contains(sc.nextInt())) count++;
		}

		System.out.println(count);

		sc.close();
	}
}