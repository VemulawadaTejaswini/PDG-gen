
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		int[] ans = new int[n + 1];
		ans[0] = -1;
		List<Integer> days = new ArrayList<>();
		for(int i = 1; i < s.length() + 1; i++) {
			if(s.charAt(i - 1) == 'x') {
				ans[i] = -1;
			} else {
				days.add(i);
			}
		}
		while(!days.isEmpty()) {
			int mark = days.get(0);
			days.remove(0);
			int cnt = 0;
			int[] list = new int[n + 1];
			for(int i = 1; i < n + 1; i++) {
				if(s.charAt(i - 1) == 'o' && i != mark) {
					list[i] = 1;
					i += c;
					cnt++;
				}
			}
			if(cnt >= k) {
				int num = 0;
				while(days.size() > num) {
					if(list[days.get(num)] == 0) {
						ans[days.get(num)] = -1;
						days.remove(num);
					} else {
						num++;
					}
				}
			} else {
				ans[mark] = 1;
			}
		}
		for(int i = 1; i < n + 1; i++) {
			System.out.print(ans[i] == 1 ? i + "\n" : "");
		}
	}

}
