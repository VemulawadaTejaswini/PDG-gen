import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String[] strs = sc.nextLine().split(" ");

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 4; i++) {
			list.add(Integer.parseInt(strs[i]));
		}

		Collections.sort(list);

		if (list.get(0) == 1 && list.get(1) == 4 && list.get(2) == 7 && list.get(3) == 9) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}