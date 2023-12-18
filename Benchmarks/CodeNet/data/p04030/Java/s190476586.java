package a20180618;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for (int i=0; i<s.length; i++) {
			if (s[i] == '0') sb.append("0");
			else if (s[i] == '1') sb.append("1");
			else if (s[i] == 'B' &&sb.length() > 0 ) sb.deleteCharAt(sb.length()-1);
		}
		System.out.println(sb.toString());
	}
}
