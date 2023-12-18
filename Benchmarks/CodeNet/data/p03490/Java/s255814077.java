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
		int size = list.size() / 2 + list.size() % 2;
		int bit = 0;
		while(true) {
			int num = 0;
			String[] array = Integer.toBinaryString(bit).split("");
			for (int i = 0; i < size; i++) {
				num = (i == 0 || array.length <= i || array[i].equals("1")) ? num + list.get(2 * i) : num - list.get(2 * i);
			}
			if (num == x) {
				break;
			}
			if (array.length > size + 1 && array[size + 1].equals("1")) {
				System.out.println("No");
				return;
			}
			bit++;
		}

		// yチェック
		size = list.size() / 2;
		bit = 0;
		while(true) {
			int num = 0;
			String[] array = Integer.toBinaryString(bit).split("");
			for (int i = 0; i < list.size() / 2; i++) {
				num = (i == 0 || array.length <= i || array[i].equals("1")) ? num + list.get(2 * i + 1) : num - list.get(2 * i + 1);
			}
			if (num == y) {
				break;
			}
			if (array.length > size + 1 && array[size + 1].equals("1")) {
				System.out.println("No");
				return;
			}
			bit++;
		}
		System.out.println("Yes");
	}
}
