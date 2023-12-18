import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		boolean reverse = false;
		for (int i = 0; i < num.length; i++) {
			if (reverse) {
				list.add(num[i]);
			} else {
				list.add(0, num[i]);
			}
			reverse = ! reverse;
		}
		if (reverse) {
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(list.get(i));
			}
		} else {
			for (int i = list.size() - 1; i >= 0; i--) {
				if (i != list.size() - 1) {
					System.out.print(" ");
				}
				System.out.print(list.get(i));
			}
		}
		System.out.println();
		scanner.close();
	}
}
