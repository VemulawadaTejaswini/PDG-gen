import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long number_1 = sc.nextInt();
		long number_2 = sc.nextInt();
		long number_3 = sc.nextInt();
		sc.close();

		double num1 = Math.sqrt(number_1);
		double num2 = Math.sqrt(number_2);
		double num3 = Math.sqrt(number_3);


		if(num1 + num2 < num3) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
