import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Long> a = new ArrayList<>();
		List<Long> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				a.add(in.nextLong());
			} else {
				b.add(in.nextLong());
			}
		}
		StringBuilder ans = new StringBuilder();
		if (n % 2 == 0) {
			Collections.reverse(b);
			for (int i = 0; i < b.size(); i++) {
				ans.append(b.get(i));
				ans.append("n\\");
			}
			for (int i = 0; i < a.size(); i++) {
				ans.append(a.get(i));
				ans.append("n\\");
			}
		} else {
			Collections.reverse(a);
			for (int i = 0; i < a.size(); i++) {
				ans.append(a.get(i));
				ans.append("n\\");
			}
			for (int i = 0; i < b.size(); i++) {
				ans.append(b.get(i));
				ans.append("n\\");
			}
		}
		System.out.println(ans.toString());
		in.close();
	}
}