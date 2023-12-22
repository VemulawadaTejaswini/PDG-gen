import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		if (args.length == 0) {
			new IllegalArgumentException();
		}
		List<Integer> intList = new ArrayList<>(args.length);
		for (String s : args) {
			intList.add(Integer.parseInt(s));
		}

		checkConstraints(intList);
		Collections.sort(intList, Collections.reverseOrder());
		for (int i = 0; i < 3; i++) {
			System.out.println(intList.get(i));
		}
	}

	private static void checkConstraints(List<Integer> list) {
		for (Integer i : list) {
			if (i < 0 || i > 10000) {
				throw new IllegalArgumentException();
			}
		}
	}
}