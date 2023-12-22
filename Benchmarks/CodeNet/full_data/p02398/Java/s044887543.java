

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a, b, c,count;
		count = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		for(;a<=b;a++){//a???b?????§????????°???????????????
			if(c%a == 0){count++;}
		}
		
		System.out.println(count);
	}
}