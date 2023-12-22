import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ABC170-A
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> x = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			x.add(sc.nextInt());
		}

		for (Integer i : x) {
			if (i == 0) {
				System.out.println(x.indexOf(i) + 1);
			}
		}

		sc.close();
	}
}
