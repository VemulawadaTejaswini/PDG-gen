

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X;
		X=sc.nextInt();
		double a=100;
		double b=1.01;
		double ans=a;
		int count=0;

		while(ans<=X) {
			ans=(int)ans*b;
			count++;
		}

		System.out.println(count);

		sc.close();

	}
}
