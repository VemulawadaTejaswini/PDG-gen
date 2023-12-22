import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		long a,b;

		Scanner scan = new Scanner(System.in);

		a = scan.nextLong();
		b = scan.nextLong();

		System.out.println(a/b + " " + a%b + " "+ a/(double)b);
		scan.close();
	}
}