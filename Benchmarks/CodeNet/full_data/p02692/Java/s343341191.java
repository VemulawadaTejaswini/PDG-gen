import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int isYES_NO = 1;

		char[] YES_choice = new char[N];

		for (int i = 0; i < N; i++) {
			String meirei = scan.next();
			if (meirei.equals("AB")) {
				if (A > B) {
					A--;
					B++;
					if (A < 0) {
						isYES_NO = 0;
						break;
					}
 					YES_choice[i] = 'B';
				} else {
					A++;
					B--;
					if (B < 0) {
						isYES_NO = 0;
						break;
					}
					YES_choice[i] = 'A';
				}
			} else if (meirei.equals("AC")) {
				if (A > C) {
					A--;
					C++;
					if (A < 0) {
						isYES_NO = 0;
						break;
					}
 					YES_choice[i] = 'C';
				} else {
					A++;
					C--;
					if (C < 0) {
						isYES_NO = 0;
						break;
					}
					YES_choice[i] = 'A';
				}
			} else if (meirei.equals("BC")) {
				if (B > C) {
					B--;
					C++;
					if (B < 0) {
						isYES_NO = 0;
						break;
					}
 					YES_choice[i] = 'C';
				} else {
					B++;
					C--;
					if (C < 0) {
						isYES_NO = 0;
						break;
					}
					YES_choice[i] = 'B';
				}
			}
		}

		if (isYES_NO == 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			for (int j = 0; j < N; j++) {
				System.out.println(YES_choice[j]);
			}
		}
	}
}