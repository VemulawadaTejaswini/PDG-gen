package concurso;

import java.util.Scanner;

public class Main {

	private static Scanner tc;

	public static void main(String[]args) {
		
		tc = new Scanner(System.in);
		int X = tc.nextInt();
		int A = tc.nextInt();
		if(X < A) {
			System.out.println("0");
			
		}else {
			if(X > A) {
				System.out.println("10");
			}
		}
	}
}
