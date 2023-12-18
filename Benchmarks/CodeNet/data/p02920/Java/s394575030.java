import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int two_n = (int) Math.pow(2, n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String str = "Yes";
		int two_j = 1;
		for (int i = 0; i < two_n; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);

		for (int i = 0, j = 0; i < (int) Math.pow(2, n - 1); i++) {
			
			if (list.get(i) > list.get(i + two_j)) {
			} else {
				str = "No";
				break;
			}
			if (i + 1 == two_j) {
				j++;
				two_j = (int) Math.pow(2, j);
			}
		}
		System.out.println(str);
	}
}
