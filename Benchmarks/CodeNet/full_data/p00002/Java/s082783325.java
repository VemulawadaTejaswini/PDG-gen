
import java.util.Scanner;

public class Main {
	static int a;
	static int b;
	static int total;
	static String totalStr;

	public static void main(String[] args) {
		while(true){

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		total = a+b;
		String totalStr = String.valueOf(total);
		System.out.println(totalStr.length());

		}

	}

}