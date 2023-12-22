import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();

			String[] data1Array = data1.split(" ");

			int seisu = Integer.parseInt(data1Array[0]);
			int length = Integer.parseInt(data1Array[1]);

			if (length == 0) {
				System.out.println(seisu);
				return;
			}

			String[] data2Array = data2.split(" ");
			int[] arr = Stream.of(data2Array).mapToInt(Integer::parseInt).toArray();
			List<Integer> list = new ArrayList<Integer>();
			for (int num : arr) {
				list.add(num);
			}

			Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
			for (int i = 0; i < 102; ++i) {
				if (list.contains(i)) {
					m.put(i, 1);
				} else {
					m.put(i, 0);
				}
			}

			int ans = 9999;
			int num = 0;
			for (int i = 0; i < 102; ++i) {
				if (m.get(i) == 1) {
					continue;
				}

				int dif = Math.abs(seisu - i);
				if (ans > dif) {
					ans = dif;
					num = i;
				}
			}
			System.out.println(num);

		}
	}
}