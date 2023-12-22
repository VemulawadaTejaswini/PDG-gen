

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		long X=sc.nextLong();
		double a = 1.01;
		double h =100;
		int count = 0;

		while(h <= X) {
			h *= a;
			h = Math.floor(h);
			count++;
		}

		System.out.println(count);


		sc.close();

	}
}
