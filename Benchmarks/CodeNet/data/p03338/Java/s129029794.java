import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int i = 0;
		int j = 0;
		int count = 0;
		int max = 0;
		for(i = 1; i < n; i++) {
			String x = s.substring(0, i);
			String y = s.substring(i);
			Set<String> set_x = new HashSet<String>();
			Set<String> set_y = new HashSet<String>();
			for(j = 0; j < x.length(); j++) {
				set_x.add(x.charAt(j) + "");
			}
			for(j = 0; j < y.length(); j++) {
				set_y.add(y.charAt(j) + "");
			}
			int before = set_y.size();
			set_y.removeAll(set_x);
			int after = set_y.size();
			if(max < before - after) {
				max = before - after;
			}
		}
		System.out.println(max);
	}
}