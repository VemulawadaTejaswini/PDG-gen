import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			scanner.nextLine();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(scanner.nextInt());
			}
			scanner.nextLine();
			LinkedList<Integer> resultList = new LinkedList<>();
			if (check(list, resultList)) {
				resultList.descendingIterator().forEachRemaining(System.out::println);
			} else {
				System.out.println(-1);
			}
		}
	}

	private static boolean check(List<Integer> list, LinkedList<Integer> resultList) {
		if (list.isEmpty()) {
			return true;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == (i + 1)) {
				resultList.add(i + 1);
				List<Integer> newList = new ArrayList<Integer>(list);
				newList.remove(i);
				List<Integer> backupResultList = new LinkedList<Integer>(resultList);
				if (check(newList, resultList)) {
					return true;
				} else {
					resultList.clear();
					resultList.addAll(backupResultList);
					resultList.remove(resultList.size() - 1);
				}
			}
		}
		return false;
	}
}