import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int points = sc.nextInt();

		List<Integer> list = new LinkedList<>();
		list.add(0);

		for (int i = 0; i < points; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		list.add(0);

		List<Integer> tempList = new LinkedList<>(list);
		int temp;

		for (int i = 1; i < list.size() - 1; i++) {

			temp = tempList.get(i);
			tempList.set(i, 0);
			System.out.println(calc(tempList));
			tempList.set(i, temp);
		}
	}

	private static int calc(List<Integer> list) {

		int temp = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			temp += Math.abs(list.get(i + 1) - list.get(i));
		}

		return temp;
	}
}