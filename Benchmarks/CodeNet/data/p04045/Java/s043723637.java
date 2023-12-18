package abc42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] strs = s.split(" ");
		List<Integer> d = new ArrayList<>();
		for (String str : strs) {
			d.add(Integer.parseInt(str));
		}

		boolean isGood = false;
		int len;
		len = String.valueOf(n).length();
		for (int i = 0; i < len; i++) {
			if (d.contains((n % (int) Math.pow(10, i + 1))
					/ (int) Math.pow(10, i))) {
				break;
			}
			if (i == len - 1) {
				isGood = true;
			}
		}

		if (isGood) {
			System.out.println(n);
			return;
		}
		n++;

	}
}
