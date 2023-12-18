
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.next());
		List<Integer> list = new ArrayList<>();
		list.add(s);
		int index = 1;
		int a = s;
		while (true) {
			//System.out.println(a);
			index++;
			a = function(a);
			if (list.contains(a)) {
				System.out.println(index);
				return;
			}
			list.add(a);
		}
	}

	private static int function(int n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}
}
