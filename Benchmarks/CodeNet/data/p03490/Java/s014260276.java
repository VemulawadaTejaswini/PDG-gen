import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();

		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for (String s : string.split("")) {
			if (s.equals("F")) {
				count++;
			} else {
				list.add(count);
				count = 0;
			}
		}
		list.add(count);

		// xチェック
		boolean[] array = new boolean[list.size() / 2 + list.size() % 2];
		while(true) {
			int num = 0;
			for (int i = 0; i < array.length; i++) {
				num = (array[i]) ? num + list.get(2 * i) : num - list.get(2 * i);
			}
			if (num == x) {
				break;
			}
			if (!stepNext(array)) {
				System.out.println("No");
				return;
			}
		}

		// yチェック
		array = new boolean[list.size() / 2];
		while(true) {
			int num = 0;
			for (int i = 0; i < array.length; i++) {
				num = (array[i]) ? num + list.get(2 * i + 1) : num - list.get(2 * i + 1);
			}
			if (num == y) {
				num = 0;
				break;
			}
			if (!stepNext(array)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	
	private static boolean stepNext(boolean[] array) {
		for (int i = 0; i < array.length; i++) {
			if (!array[i]) {
				array[i] = true;
				return true;
			}
			array[i] = false;
		}
		return false;
	}
}
