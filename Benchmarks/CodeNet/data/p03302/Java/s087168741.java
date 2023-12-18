package text;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		
		if(a * b == 15) {
			System.out.println("*");
		}else {
			if (a + b == 15) {
				System.out.println("+");
			}else {
				System.out.println("×");
			}
		}
	}
}