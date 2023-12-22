import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A0001 {
	public static void main(String[] args) throws IOException {
		List<Integer> ls = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			if (!sc.hasNextInt()) {
				break;
			}
			int n = sc.nextInt();
			ls.add(Integer.valueOf(n));
		}

		Collections.sort(ls);
		Collections.reverse(ls);

		for (int height : ls.subList(0, Math.min(ls.size(), 3))) {
			System.out.println(height);
		}
	}
}