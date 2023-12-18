import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			set.add(c);
		}
		for (char c = 'a'; c <= 'z'; c++) {
			if (set.contains(c)) {
				continue;
			} else {
				System.out.println(s + c);
				return;
			}
		}
//		char ha = 'z';
//		boolean flag = true;
//		for(char c : s.toCharArray()) {
//			if(ha==c) ha--;
//			else flag=false;
//		}
//		if(flag) {
//			System.out.println("-1");
//			return;
//		}
		for (int i = s.length() - 1; i > 0; i--) {
			String ss = s.substring(i);
			String a = s.substring(0, i-1);
			//System.out.println(ss);
			for (char c : ss.toCharArray()) {
				set.remove(c);
			}
			for (char c = s.charAt(i - 1); c <= 'z'; c++) {
				if (set.contains(c)) {
					continue;
				} else {
					System.out.println(a+c);
					return;
				}
			}
			for (char c : ss.toCharArray()) {
				set.add(c);
			}
		}
		System.out.println(-1);
	}
}