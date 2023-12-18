import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveD();
	}

    private void solveD() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.nextLine();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean start = true;
		boolean is_x = true;
		List<Integer> xs = new ArrayList<>();
		List<Integer> ys = new ArrayList<>();
		int charge = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'F') {
				if (start) {
					x--;
				} else {
					charge++;
				}
			}
			if (c == 'T') {
				if (charge > 0) {
					if (is_x) {
						xs.add(charge);
					} else {
						ys.add(charge);
					}
				}
				start = false;
				is_x = !is_x;
				charge = 0;
			}
		}
		if (charge > 0) {
			if (is_x) {
				xs.add(charge);
			} else {
				ys.add(charge);
			}
		}
		Collections.sort(xs, Comparator.reverseOrder());
		Collections.sort(ys, Comparator.reverseOrder());
		int sum_x = 0;
		for (int tmp_x : xs) {
			sum_x += tmp_x;
		}
		int sum_y = 0;
		for (int tmp_y : ys) {
			sum_y += tmp_y;
		}
		int diff_x = sum_x - x;
		int diff_y = sum_y - y;
		if (search(xs, 0, diff_x, sum_x) && search(ys, 0, diff_y, sum_y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private boolean search(List<Integer> list, int start_index, int diff, int rest) {
		for (int index = start_index; index < list.size(); index++) {
			int num = list.get(index);
			rest -= num;
			if (num * 2 <= diff && diff - num * 2 <= rest * 2 && diff > 0) {
				if (search(list, start_index + 1, diff - num * 2, rest)) {
					return true;
				}
			}
		}
		return diff == 0;
	}
}