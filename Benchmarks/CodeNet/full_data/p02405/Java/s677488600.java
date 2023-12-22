package Structured_Program_I;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int i,j;
		String a,b,tmp;
		a = "#";
		b = ".";
		while(h!=0 && w != 0) {
			for(i=0;i<h;i++) {
				for(j=0;j<w;j++) {
					if(i%2 == 0) {
						System.out.print(a);
					}else {
						System.out.print(b);
					}
					tmp = a;
					a = b;
					b = tmp;

				}
				System.out.println();
			}
			System.out.println();
			h = scan.nextInt();
			w = scan.nextInt();
		}
	}
}

