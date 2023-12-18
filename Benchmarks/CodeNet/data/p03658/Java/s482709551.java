import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int k = sc.nextInt();

		List<Integer> lList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			lList.add(sc.nextInt());
		}

		Collections.sort(lList);
		Collections.reverse(lList);

		int result = 0;
		for (int j = 0; j < k; j++) {
			result = result + lList.get(j);
		}

		System.out.print(result);

	}

}