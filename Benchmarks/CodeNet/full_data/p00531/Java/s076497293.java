
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,p;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		p = sc.nextInt();
		int r1,r2;
		r1 = a*p;
		r2 = (p<=c)? b : b + (p - c) * d;

		System.out.println(Math.min(r1, r2));

	}

}