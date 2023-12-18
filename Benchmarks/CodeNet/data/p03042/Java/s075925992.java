//package abc127.B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int y = Integer.parseInt("" + s.charAt(0) + s.charAt(1));
		int m = Integer.parseInt("" + s.charAt(2) + s.charAt(3));
		
		String ans;
		if (1 <= y && y <= 12 && 1 <= m && m <= 12) ans = "AMBIGUOUS";
		else if (1 <= m && m <= 12) ans = "YYMM";
		else if (1 <= y && y <= 12) ans = "MMYY";
		else ans = "NA";
		
		System.out.println(ans);
		
	}

}
