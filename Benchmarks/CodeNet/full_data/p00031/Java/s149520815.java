import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	private static final String SEPARATOR = " ";

	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(System.in);
			Integer[] weight = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };

			while (s.hasNextInt()) {
				int gram = s.nextInt();
				List<Integer> weightList = new ArrayList<Integer>();

				Arrays.sort(weight, Collections.reverseOrder());
				for (int x : weight) {
					if (x <= gram) {
						gram -= x;
						weightList.add(x);
					}
				}
				Collections.sort(weightList);
				System.out.println(punctuate(weightList, SEPARATOR));
			}
		} finally {
			s.close();
		}
	}

	public static StringBuffer punctuate(List<Integer> list, String s) {
		StringBuffer sb = new StringBuffer();;
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i < list.size() - 1) sb.append(s);
		}
		return sb;
	}
}