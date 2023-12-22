import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String x = sc.next();
		for(int i = 0; i < n; i++) {
			String temp = "";
			if(x.charAt(i) == '0') {
				for(int j = 0; j < x.length(); j++) {
					if(j != i) {
						temp += x.charAt(j);
					}else {
						temp += '1';
					}
				}
				System.out.println(f(temp));
			}else {
				for(int j = 0; j < x.length(); j++) {
					if(j != i) {
						temp += x.charAt(j);
					}else {
						temp += '0';
					}
				}
				System.out.println(f(temp));
			}
			
		}
	}
	
	static int f(String ni) {
		int cnt = 0;
		int kosu = 0;
		while(true) {
			int n = Integer.parseInt(ni, 2);
			kosu = popcount(ni);
			n %= kosu;
			++cnt;
			if(n == 0) {
				break;
			}
			ni = Integer.toBinaryString(n);
		}
		return cnt;
	}
	
	static int popcount(String ni) {
		int cnt = 0;
		for(int i = 0; i < ni.length(); i++) {
			if(ni.charAt(i) == '1') {
				++cnt;
			}
		}
		return cnt;
	}
	
}