package a;

import java.util.Scanner;

public class Main {
		static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			String contest = sc.nextLine();
			if(contest.equals("ARC")) {
				System.out.println("ABC");
			} else {
				System.out.println("ARC");
			}
		}
}
