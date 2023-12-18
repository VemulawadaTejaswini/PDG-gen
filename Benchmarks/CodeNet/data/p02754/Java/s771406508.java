import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();

		long r = a * (n / (a+b));
		long k = n % (a+b);
		r += (  k < a ? k : a  );

		System.out.println(r);
	}

}
