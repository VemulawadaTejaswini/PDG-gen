import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		sc.close();
/*
		double num1 = Math.sqrt(a);
		double num2 = Math.sqrt(b);
		double num3 = Math.sqrt(c);
*/

		long ab = a*b;
		long bc = b*c;
		long ca = c*a;

		if(0 < (c-a)*(c-a) + b*b - 2*(ab + bc) ){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
