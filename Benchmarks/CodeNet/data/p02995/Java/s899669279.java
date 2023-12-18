
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long q = (b/c)-((a-1)/c);
		long r = (b/d)-((a-1)/d);
		long s = (b/(c*d))-((a-1)/(c*d));
		System.out.println(q+r-s);

	}

}
