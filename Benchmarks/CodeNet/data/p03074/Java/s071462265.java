import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int k = sc.nextInt();
		String S = sc.next(); List<Integer> group = new ArrayList<Integer>();
		int len = 0; char c = S.charAt(0); int sum = 0; int max = 0;

		for(int i = 0; i < n; i++) {
			if(i == 0 && c != '1') group.add(0);
			if(c == S.charAt(i)) {
				len++;
			}else {
				group.add(len);
				len = 1;
				c = (c == '0') ? '1' : '0';
			}
			if(i == n - 1) {
				if(c == '1') {
					group.add(len);
				}else {
					group.add(len);
					group.add(0);
				}
			}
		}
      
		if(group.size() < 2 * k + 1) {
			for(int i : group) max += i;
		}else {
			for(int i = 0; i < 2 * k + 1; i++) sum += group.get(i);
			max = sum;
			for(int i = 2 * k + 1; i < group.size(); i++) {
				sum = sum + group.get(i) - group.get(i-1);
				max = Math.max(sum, max);
			}
		}
		System.out.println(max);

		sc.close();
	}
}