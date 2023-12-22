import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);

		long A = sc.nextLong();
		double B = sc.nextDouble();

		//整数に直してint型に変換。
		B = B*100;
		long B_100 = (long)B;
		long anser = (A*B_100)/100;

		System.out.println(anser);
	}
}