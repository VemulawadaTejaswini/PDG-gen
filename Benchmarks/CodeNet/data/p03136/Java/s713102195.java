import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (reader.hasNextInt()) {
			list.add(reader.nextInt());
		}
		String result = "No";

		if (!(list.size() != n || n < 3 || 10 < n)) {
			int largest = list.get(0);
			int index = 0;
			for (int i = 1; i < list.size(); i++) {
				if (largest < list.get(i)) {
					largest = list.get(i);
					index = i;
				}
			}
			int sum = 0;
			for (int j = 0; j < list.size(); j++) {
				if (index != j) {
					sum += list.get(j);
				}
			}
			if (largest < sum) {
				result = "Yes";
			}
		}

		System.out.print(result);
		reader.close();
	}
}
