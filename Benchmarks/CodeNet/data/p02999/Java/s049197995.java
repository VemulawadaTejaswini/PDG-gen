package concurso;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		Scanner tc = new Scanner(System.in);
		int X = tc.nextInt();
		int A = tc.nextInt();
		
		if(X < 0) {
			System.out.println("error");
		}else {
			if(X > 9) {
				System.out.println("error");
			}else {
				if(A < 0) {
					System.out.println("error");
			}else {
				if(A > 9) {
					System.out.println("error");
			}else {
			
		
		if(X < A) {
			System.out.println("0");
			
		}else {
			if(X > A) {
				System.out.println("10");
			}
		}
	}
	}
}
}
	}
}