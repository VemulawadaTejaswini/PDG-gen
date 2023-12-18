

import java.util.*;
import java.math.*;
public class Main{

	static   Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = sc.nextInt();
		String str[] = new String[N];
		int countA = 0;
		int countB = 0;
		int countAB = 0;
		int count = 0;
		StringBuilder concat = new StringBuilder();
		for (int i = 0; i < N ; i++) {
			str[i] = sc.next();
			if (str[i].endsWith("AB") == false) {
				if (str[i].charAt(0) == 'B') {
					if (str[i].charAt(str[i].length() - 1) == 'A') {
						countA++;
						countB++;
						countAB++;
					} else {
						countB++;
					}
				} else if (str[i].charAt(str[i].length() - 1) == 'A') {
					countA++;
				}
			}
		}
		count += Math.min(countA, countB);
		if (count != 0 && count == countAB) {
			count--;
		}
		
		for (String s: str) {
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.substring(i, i + 2).equals("AB")) {
					count++;
				}
			}
		}
		
		String msg = "No";
	
		
		System.out.println(count);

		
	}

}
