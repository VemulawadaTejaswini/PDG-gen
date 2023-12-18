import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		String s = in.nextLine();
		in.close();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				arr.add(0);
			} else if (s.charAt(i) == '1') {
				arr.add(1);
			} else {
				if (arr.size() == 0) {
					continue;
				} else {
					arr.remove(arr.get(i - 1));
				}
			}
		}
		for (int e : arr) {
			System.out.print(e);
		}
	}
}