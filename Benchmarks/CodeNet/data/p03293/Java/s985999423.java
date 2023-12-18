package com.leaf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		
		int k = 0;
		if(S.equals(T)) {
			System.out.println("yes");
		}else {
			for (int i = 0; i < S.length(); i++) {
				String a = S.substring(0, i);
				if(!T.contains(a)) {
					k = i - 1;
				}
			}
			if(k==0) {
				System.out.println("no");
			}else {
				if((!S.substring(k,S.length()-1).equals(""))&&T.contains(S.substring(k,S.length()-1))) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}
		
		
		
	}

}
