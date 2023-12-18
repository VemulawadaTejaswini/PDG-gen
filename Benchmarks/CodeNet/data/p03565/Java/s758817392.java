package alg1;

import java.util.ArrayList;
import java.util.Scanner;

public class atcoder {

	public atcoder() {
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String  s = sc.next();
		String t = sc.next();
		int count = 0;
		for(int i=t.length(); i<s.length(); i++) {
			String subs = s.substring(i - t.length(), i);
			for(int j=0; j<t.length(); j++) {
				if(subs.charAt(j) == '?' || subs.charAt(j) == t.charAt(j)) {
					count++;
				}
				else break;
			}
		}
		
	}
	

}