import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		if (n <= 100) {
			String input = scan.nextLine();
			String[] in = input.split(" ");
			List<Integer> list = new ArrayList<>(n);
			for (int i = 0; i < in.length; i++) {
				int ai = Integer.parseInt(in[i]);
				if (ai >= 0 && ai < 1000) {
					list.add(ai);
				}
			}
			Collections.reverse(list);
			for (int ai : list) {
				System.out.print(ai + " ");
			}
		}
	}
}