import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int a,b;
		double db;

		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();

		db = (double)(a/b);

		System.out.println(a/b + " " + a%b + " "+ db);
		scan.close();
	}
}