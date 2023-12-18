import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> value = new ArrayList<Integer>();
		ArrayList<Integer> cost = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			final int v = sc.nextInt();
			value.add(v);
		}
		for (int i = 0; i < n; i++) {
			final int c = sc.nextInt();
			cost.add(c);
		}

		int result = 0;
		for (int j = 0; j < n; j++) {
			final int result1 = value.get(j) - cost.get(j);
			if (result1 > 0) {
				result = result + result1;
			}
		}

		System.out.println(result);

	}

}
