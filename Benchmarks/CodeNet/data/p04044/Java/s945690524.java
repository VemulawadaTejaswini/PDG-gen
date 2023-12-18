import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int n = scan.nextInt();
		List<String> s = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			s.add(scan.next());
		}
		Collections.sort(s, Comparator.naturalOrder());
		System.out.println(String.join("", s));
	}

}
