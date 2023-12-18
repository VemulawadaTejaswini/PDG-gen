package dec;

import java.util.Scanner;

public class De1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		if((a+b)>(c+d))
			System.out.println("Left");
		if((a+b)>(c+d))
			System.out.println("Right");
		if((a+b)==(c+d))
			System.out.println("Balanced");
		
	}
}
