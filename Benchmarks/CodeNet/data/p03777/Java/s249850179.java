package atCoder0319;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		char b = sc.nextLine().charAt(0);
		if (a=='H'){
			System.out.println(b=='H'?'H':'D');
		}
		else if (a=='D'){
			System.out.println(b=='H'?'D':'H');
		}
	}

}
