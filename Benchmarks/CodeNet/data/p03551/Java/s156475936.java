
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double x = 0;
		int y = 0;

		if(n-m>0){
			y = (n-m)*100;
		}
		int k = (int)Math.pow(2, m);

		//int -2147483648 2147483647だと長過ぎる
		/*
		 * 21474836だと長すぎ、
		 * 2147483だと間違う
		 *
		 *
TLE
4099999

WA
3999999
		 * */
		double p,q;
		for(int i=1; i<4050000; i++){
			p=1-1/Math.pow(2, m);
			q=Math.pow(p, i-1);
			x += (double)(y + 1900*m)*i*(q*/Math.pow(2, m));
		}
		System.out.println((int)x);
		sc.close();

	}
}
