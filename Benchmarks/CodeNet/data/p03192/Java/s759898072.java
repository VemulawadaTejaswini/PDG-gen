package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] strs = str.split("");
		int cnt = 0;

		for(int i=0; i<strs.length; i++) {

			if(strs[i].equals("2")) {
				cnt++;

			}
		}
		System.out.println(cnt);
	}
}
