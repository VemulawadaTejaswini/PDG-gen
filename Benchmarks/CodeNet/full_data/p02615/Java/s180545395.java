import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			ArrayList<Long> a = new ArrayList<>(n);
			for (int i = 0; i < n; i++) {
				a.add(sc.nextLong());
			}

			Collections.sort(a);
			Collections.reverse(a);

			long sum = a.get(0) + a.get(1);
			for (int i = 3; i < a.size(); i++) {
				sum += a.get(i - 2);
			}
			System.out.println(sum);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}