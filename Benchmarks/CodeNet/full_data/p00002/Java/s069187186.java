import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//??????????????°

		int num1;
		int num2;
		int goukei;

		num1 = new Scanner(System.in).nextInt();
		num2 = new Scanner(System.in).nextInt();

		goukei = num1 + num2;

		String keta = String.valueOf(goukei);

		System.out.println(keta.length());


	}

}