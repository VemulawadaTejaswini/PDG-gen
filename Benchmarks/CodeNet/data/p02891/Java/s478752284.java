package test;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();

		int min = 0;

		int sl = s.length();

		boolean bf = false;
		if (sl >2) {
			for (int i=0; i<sl-2; i+=2) {
				if ((sl-i)%3 == 0) {
					char ci = s.charAt(i);
					char ci1 = s.charAt(i+1);
					char ci2 = s.charAt(i+2);
					if (ci == ci1) {
						min+=1;
					}
				}
				else if ((sl-i)%3 == 1) {
					char ci = s.charAt(i);
					char ci1 = s.charAt(i+1);
					bf = true;
					if (ci == ci1) {
						min+=1;
						bf = true;
					}
				}
			}
			if (s.charAt(0) == s.charAt(sl-1) && !bf) {
				min +=k-1;
			}
		}else if (sl == 2) {

			//Sが2の場合
			//同じ文字を選んでいる場合
			if (sl == 2) {
				if (s.charAt(0) == s.charAt(1)) {
					min = k;
				}
				else {
					min = 0;
				}
			}
		}
		else {
			//Sが1の場合
			if (sl == 1) {
				min = k/2;
			}
		}
	}
}
