
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		List<Integer> list = new LinkedList<>(S.chars().mapToObj(n -> Integer.valueOf(n)).collect(Collectors.toList()));

		int ans = solv(list);
		System.out.println(ans);
	}

	private static int solv(List<Integer> list) {
		int max = 0;
		for (int index = 1; index < list.size(); index++) {
			if (list.get(index - 1) != list.get(index)) {
				LinkedList<Integer> temp = new LinkedList<>(list);
				temp.remove(index);
				temp.remove(index - 1);
				max = Math.max(2 + solv(temp), max);
			}
		}
		return max;
	}
}
