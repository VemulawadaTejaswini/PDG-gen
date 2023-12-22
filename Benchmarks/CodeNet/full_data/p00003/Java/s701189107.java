import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			int[] line = convertInt(sc.nextLine().split(" "));
			sort(line);
			if ((line[2] * line[2]) == ((line[0] * line[0]) + (line[1] * line[1]))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static void sort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (array[j] < array[j - 1]) {
					int box = array[j - 1];
					array[j - 1] = array[j];
					array[j] = box;
				}
			}
		}
	}

	public static int[] convertInt(String[] str) {
		int n = str.length;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		return array;
	}
}