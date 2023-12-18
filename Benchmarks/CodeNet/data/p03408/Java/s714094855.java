import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<String> s = new ArrayList<String>();
		int i = 0;
		for(i = 0; i < n; i++) {
			s.add(scan.next());
		}
		int m = scan.nextInt();
		List<String> t = new ArrayList<String>();
		for(i = 0; i < m; i++) {
			t.add(scan.next());
		}
		int max = 0;
		for(; s.size() != 0;) {
			int s_before = s.size();
			int t_before = t.size();
			List<String> set = new ArrayList<>();
			Collections.addAll(set, s.get(0));
			s.removeAll(set);
			t.removeAll(set);
			int s_after = s.size();
			int t_after = t.size();
			int money = (s_before - s_after) - (t_before - t_after);
			if(max < money) {
				max = money;
			}
		}
		System.out.println(max);
	}
}