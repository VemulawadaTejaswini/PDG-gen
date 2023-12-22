import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		bubbleSort(list);
	}

	public static void bubbleSort(List<Integer> list) {
		int count = 0;
		for (int i = 1; i < list.size(); i++) {
			int j = i - 1;
			while (j >= 0 && list.get(j + 1) < list.get(j)) {
				int tmp = list.get(j + 1);
				list.set(j + 1, list.get(j));
				list.set(j, tmp);
				j--;
				count++;
			}
		}
		showList(list);
		System.out.println(count);
	}

	public static void showList(List<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		System.out.println(list.get(list.size() - 1));
	}
}

