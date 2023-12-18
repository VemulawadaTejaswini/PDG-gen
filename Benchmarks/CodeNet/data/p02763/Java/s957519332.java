import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		char[] chars = scan.next().toCharArray();
		HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
		for (char c = 'a'; c <= 'z'; c++) {
			map.put(c, new ArrayList<Integer>());
		}
		for (int i = 0; i < chars.length; i++) {
			map.get(chars[i]).add(i);
		}

		int q = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < q; i++) {
			int q1 = scan.nextInt();
			if (q1 == 1) {
				int q2 = scan.nextInt();
				char q3 = scan.next().charAt(0);
				remove(map, q2);
				add(map, q2, q3);
			} else {
				int q2 = scan.nextInt();
				int q3 = scan.nextInt();
				list.add(count(map, q2, q3));
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		scan.close();
	}

	private static void remove(HashMap<Character, ArrayList<Integer>> map, int q2) {
		for (char c = 'a'; c <= 'z'; c++) {
			ArrayList<Integer> list = map.get(c);
			int index = search(list, 0, list.size(), q2 - 1);
			if (index < list.size() && list.get(index) == q2 - 1) {
				list.remove(index);
			}
		}
	}

	private static void add(HashMap<Character, ArrayList<Integer>> map, int q2, char q3) {
		ArrayList<Integer> list = map.get(q3);
		int index = search(list, 0, list.size(), q2 - 1);
		if (index < list.size()) {
			list.add(index, q2 - 1);
		}else {
			list.add(q2 - 1);
		}
	}

	private static int count(HashMap<Character, ArrayList<Integer>> map, int q2, int q3) {
		int count = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			ArrayList<Integer> list = map.get(c);
			if (list.size() > 0) {
				int index = search(list, 0, list.size(), q2 - 1);
				if (index < list.size() && list.get(index) <= q3 - 1) {
					count++;
				}
			}
		}

		return count;
	}

	private static int search(ArrayList<Integer> list, int start, int end, int value) {
		int length = (end - start) / 2;
		int target = Math.max(Math.min(start + length, end - 1), 0);

		if (target >= list.size()) {
			return target;
		}else if (list.get(target) == value) {
			return target;
		} else if (list.get(target) > value) {
			if (length < 1) {
				return target;
			}
			return search(list, start, start + length, value);
		} else {
			if (length < 1) {
				return target + 1;
			}
			return search(list, target + 1, end, value);
		}
	}
}