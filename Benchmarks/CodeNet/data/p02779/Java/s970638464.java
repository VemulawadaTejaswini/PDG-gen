

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String anser = "Yes";

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			map.put(i, scan.nextInt());
		}

		for (int i = 0; i < N; i++) {
			int size = map.size();
			map.remove(i);

			if (size - 1 > map.size()) {
				anser = "No";
				break;
			}
		}
		System.out.println(anser);
	}

}
