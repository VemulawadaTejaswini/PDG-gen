//package abc124.B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = "ACGT";
		
		int ans = 0, cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (t.indexOf(s.charAt(i)) >= 0) cnt++;
			else cnt = 0;
			ans = Math.max(ans, cnt);
		}
		
		System.out.println(ans);
	}

}
