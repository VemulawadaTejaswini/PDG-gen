import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double x = Math.PI;

		double menseki = r * r * x;
		double enshu = 4 * x * r;

		System.out.printf("%f", menseki);
		System.out.printf("%f", " ");
		System.out.printf("%f", enshu);

	}

}

