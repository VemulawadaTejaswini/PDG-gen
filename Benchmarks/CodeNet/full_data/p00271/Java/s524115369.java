package ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a,b,c;
		c = 1;

		do{
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a - b);
			c++;
		}while(c > 7);
	}
}