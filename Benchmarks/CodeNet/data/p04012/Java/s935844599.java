
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] list = s.toCharArray();
		
		int cnt = 0;
		String ans = "Yes";
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] == list[j]) {
					cnt++;
				}
			}
			if (cnt % 2 == 1) {
				ans = "No";
				break;
			}
		}
		
		System.out.println(ans);
	}
}