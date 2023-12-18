

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.next());
		ArrayList<Integer> heightList = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			heightList.add(Integer.parseInt(sc.next()));
		}

		StringBuilder isHeightThanRightString = new StringBuilder();
		for (int i = 0; i < size - 1; i++) {

			if (0 <= heightList.get(i) - heightList.get(i + 1)) {
				isHeightThanRightString.append("t");
			} else {
				isHeightThanRightString.append("f");
			}
		}

		String[] tfArr = isHeightThanRightString.toString().split("f");
		int result = Stream.of(tfArr).max(Comparator.comparingInt(String::length)).orElse("").length();
		System.out.println(result);

	}
}
