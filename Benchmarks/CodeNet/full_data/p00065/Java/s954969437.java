import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int a[];
		int index;

		a = new int[1000];
		index = 0;
		while (true) {
			String st[] = sc.nextLine().split(",");
			if (st.length != 2) {
				break;
			}
			if (map.get(Integer.valueOf(st[0])) == null) {
				map.put(Integer.valueOf(st[0]), 1);
			} else {
				map.put(Integer.valueOf(st[0]), map.get(Integer.valueOf(st[0])) + 1);
			}
		}
		//		while (sc.hasNext()) {
		for (int i = 0; i < 3; i++) {
			String st[] = sc.nextLine().split(",");
			if (map.get(Integer.valueOf(st[0])) != null) {
				map.put(Integer.valueOf(st[0]), map.get(Integer.valueOf(st[0])) + 1);
				boolean flag = true;
				for (int j = 0; j < index && flag; j++) {
					if (a[j] == Integer.valueOf(st[0])) {
						flag = false;
					}
				}
				if (flag) {
					a[index++] = Integer.valueOf(st[0]);
				}
			}
		}
		quickSort(a, 0, index - 1);
		for (int i = 0; i < index; i++) {
			System.out.println(a[i] + " " + map.get(a[i]));
		}
	}

	public static void quickSort(int a[], int low, int high) {
		if (high <= low) {
			return ;
		}
		int i = low;
		int j = high;
		int x = a[(low + high) / 2];
		while (i <= j) {
			while (a[i] < x) {
				i++;
			}
			while (x < a[j]) {
				j--;
			}
			if (i <= j) {
				int swap = a[i];
				a[i] = a[j];
				a[j] = swap;
				i++;
				j--;
			}
		}
		quickSort(a, low, j);
		quickSort(a, i, high);
	}
}