import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	static void ab(String str) {
		for(int a=0;a<10000;a++) {
			if(a%2==0 || a%13==0 || a%26==0) continue;
			for(int b=0;b<26;b++) {
				if(check(change(str,a,b))) {
					return;
				}
			}
		}
	}
	
	static String change(String str,int a,int b) {
		StringBuffer ans = new StringBuffer();
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)==' ') {
				ans.append(" ");
			}else {
				int x = Arrays.binarySearch(letters, str.charAt(j));
				int f = (a*x+b)%26;
				ans.append(letters[f]);
			}
		}
		return ans.toString();
	}
	
	static boolean check(String ans) {
		for(int k=0;k<ans.length()-3;k++) {
			String key = ans.substring(k,k+4);
			if(key.equals("that") || key.equals("this")) {
				System.out.println(ans);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				String str = sc.next();
				ab(str);
			}
		}
	}
}

