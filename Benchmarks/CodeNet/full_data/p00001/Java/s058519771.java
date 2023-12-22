import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>(args.length);
		for (String s : args) {
			intList.add(Integer.parseInt(s));
		}

		Collections.sort(intList, Collections.reverseOrder());
		for (int i = 0; i < 3; i++) {
			System.out.println(intList.get(i));
		}
	}

}