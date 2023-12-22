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
		selectionSort(list);
	}

	public static void selectionSort(List<Integer> list) {
		int tail = -1;
		int count = 0;
		while (tail < list.size() - 1) {
			int min = list.get(tail + 1);
			int minIdx = tail + 1;
			for (int i = minIdx + 1; i < list.size(); i++) {
				if (min > list.get(i)) {
					min = list.get(i);
					minIdx = i;
				}
			}
			if (list.get(tail + 1) > min) {
				list.set(minIdx, list.get(tail + 1));
				list.set(tail + 1, min);
				count++;
			}
			tail++;
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

