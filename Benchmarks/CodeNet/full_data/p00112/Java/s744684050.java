import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			int k = list.size() - 1;
			sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i) * k;
				k--;
			}
			System.out.println(sum);
		}
	}
}