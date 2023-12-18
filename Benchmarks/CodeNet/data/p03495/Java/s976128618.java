import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(sc.next());
			int index = a.indexOf(b);
			if (index != -1)
				c.set(index, c.get(index) + 1);
			else {
				a.add(b);
				c.add(1);
			}
		}
		/*Collections.sort(c);
		int ans = 0;
		for (int i = 0; i < a.size() - k; i++) {
			ans += c.get(i);
		}*/
		Collections.sort(c, Collections.reverseOrder());
		int ans = 0;
		for (int i = 0; i < ((k < c.size())? k : c.size()); i++) {
			ans += c.get(i);
		}
		ans = n - ans;
		System.out.println(ans);
	}
}