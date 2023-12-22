import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		System.out.print(String.format("%.6f", r * r * Math.PI) + " ");
		System.out.println(String.format("%.6f", 2 * r * Math.PI));

	}

}

