import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		sc.close();
		String ans[] = {"Yes", "No"};
		int an = 1;
		int n = t.length();
		char tmp = '!';
		for(int i = 0; i < n; ++i) {
			char tmpt = t.charAt(i);
			char tmps = s.charAt(i);
			if(tmps != tmpt) {
				s = s.replace(tmpt, tmp);
				s = s.replace(tmps, tmpt);
				s = s.replace(tmp, tmps);
			}
		}
		if(t.equals(s))an = 0;
		System.out.println(ans[an]);
	}
}
