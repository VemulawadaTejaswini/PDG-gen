//package sportprogramming;

import java.util.Scanner;

public class Main {
	public static void A() {
		Scanner s = new Scanner(System.in);
		String st = s.next();
		int k = s.nextInt();
		StringBuilder str = new StringBuilder(st);
//		StringBuilder str = new StringBuilder();
//		for(int i = 0; i < k; i++) {
//			str.append(st);
//		}
		
		long ans = 0;
	
		char prev = str.charAt(0);
		
		for(int j = 1; j < str.length(); j++) {
			if(str.charAt(j) == prev) {
				ans++;
				prev = '-';
			} else {
				prev = str.charAt(j);
			}
		}
		k--;
		if(k > 0) {
			long newans = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == prev) {
					newans++;
					prev = '-';
				} else {
					prev = str.charAt(j);
				}
			}
			newans += (newans * (k - 1));
			ans += newans;
		}
			
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A();
	}

}
