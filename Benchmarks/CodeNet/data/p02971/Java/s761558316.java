import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		Integer[] ArrayA = new Integer[n];

		for (int i = 0; i < n; i++) {
			ArrayA[i] = sc.nextInt();
		}

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(ArrayA));
		List<Integer> relist = new ArrayList<Integer>(Arrays.asList(ArrayA));

		for (int i = 0; i < n; i++) {

			list = relist;
			list.remove(i);

			Collections.sort(list);

			System.out.println(list.get(n - 1));

		}

	}
}
