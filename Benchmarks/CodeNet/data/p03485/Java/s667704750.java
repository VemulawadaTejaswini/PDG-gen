import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = 0;

		x = (a + b) / 2.0;
		if(x % 10 < 5)
			x = (int)x;
		else
			x = (int)x + 1;

		System.out.println((int)x);

		sc.close();
	}

}