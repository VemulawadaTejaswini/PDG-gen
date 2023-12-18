

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		b = Math.max(c,b/c*c);
		if(a > b){
			System.out.println(0);
			return;
		}
		a = Math.max(c, a/c*c);


//		System.out.println(b - a);
		System.out.println((b - a)/c + 1);
    }
}