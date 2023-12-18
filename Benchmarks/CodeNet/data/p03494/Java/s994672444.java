import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		int s = scan.nextInt();

		for (int i = 0; i < s; i++) {
			list.add(scan.nextInt());
		}
		//char[] c = s.toCharArray();

		int cunt = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.add(list.get(i) % 2);
				if (i == list.size()) {
					cunt++;
				}
			}
			else
				break;
		}
		System.out.println(cunt);

	}
}