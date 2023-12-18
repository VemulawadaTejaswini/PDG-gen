import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String input = reader.next();

		Map<String, List<Integer>> data = new HashMap<>();

		int result = 1000000;

		for (int i = 1; i <= input.length(); i++) {
			String key = Character.toString(input.charAt(i - 1));
			Integer value = Integer.valueOf(i);

			if (data.containsKey(key)) {
				data.get(key).add(value);
			} else {
				data.put(key, new ArrayList<>(Arrays.asList(value)));
			}
		}

		for (Map.Entry<String, List<Integer>> entry : data.entrySet()) {
			Integer max = 0;
			Integer previous = 1;

			for (Integer i : entry.getValue()) {
				if (i - previous > max) {
					max = i - previous;
				}
				previous = i + 1;
			}

			if (input.length() - previous > max) {
				max = input.length() - previous;
			}

			if (result > max) {
				result = max;
			}
		}

		System.out.println(result);

		reader.close();
	}
}