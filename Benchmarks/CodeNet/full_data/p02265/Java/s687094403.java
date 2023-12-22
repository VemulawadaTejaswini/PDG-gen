import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		Deque<Integer> list = new ArrayDeque<Integer>();

		for (int i = 0; i < n; i++) {
			String kari = sc.nextLine();

			// if (kari.equals("deleteFirst")) {
			// list.remove(list.size() - 1);
			// } else if (kari.equals("deleteLast")) {
			// list.remove(0);
			// } else {
			// String[] kari2 = kari.split(" ");
			// int x = Integer.parseInt(kari2[1]);
			// if (kari2[0].equals("insert")) {
			// list.add(x);
			// } else if (kari2[0].equals("delete")) {
			// if (list.contains(x)) {
			// list.remove(list.lastIndexOf(x));
			// }
			// }
			// }

			if (kari.charAt(0) == 'i') {
				list.offerFirst(Integer.parseInt(kari.substring(7)));
			} else if (kari.charAt(6) == 'L') {
				list.removeLast();
			} else if (kari.charAt(6) == 'F') {
				list.removeFirst();
			} else {
				try {
					list.remove(Integer.valueOf(kari.substring(7)));
				} catch (Exception e) {

				}

			}
		}

		// while (list.size() > 1) {
		// System.out.print(list.pop());
		// System.out.print(" ");
		// }
		// System.out.println(list.get(0));

		StringBuilder answer = new StringBuilder();
		while (list.size() > 1) {
			answer.append(list.pop());
			answer.append(" ");
		}
		answer.append(list.pop());
		System.out.println(answer);
	}

}