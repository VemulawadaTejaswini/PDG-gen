import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		while (reader.hasNextInt()) {
			list.add(reader.nextInt());
		}

		Collections.sort(list);

		int sum = 0;
		int size = list.size();

		for (int i = 0; i < size / 2; i++) {
			sum = sum + list.get(size - i - 1) - list.get(i);
			if ( i < size / 2 - 1) {
				sum = sum + list.get(size - i - 2) - list.get(i);
			}
		}

		if (size % 2 == 1) {
			sum = sum + list.get(size / 2 + 1) - list.get(size / 2);
		}

		System.out.println(sum);
		reader.close();

	}

}
