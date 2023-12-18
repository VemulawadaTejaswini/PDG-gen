import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		List lst = new ArrayList<Integer>();

		while (!lst.contains(s)) {
			lst.add(s);
			if (s % 2 == 0) {
				s /= 2;
			} else {
				s = 3 * s + 1;
			}
		}

		System.out.println(lst.size() + 1);
	}
}
