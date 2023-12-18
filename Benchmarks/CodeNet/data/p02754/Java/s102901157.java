import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		int r = a * (n / (a+b));
		int k = n % (a+b);
		r += (  k <a ? k : a  );

		System.out.println(r);
	}

}

