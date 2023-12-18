import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong(), a = s.nextLong(), b = s.nextLong();
		long r = 0;
		if ((b-a) % 2 == 0) {
			r = (b-a)/2;
			System.out.println(r);
		}else {
			long r1 = Math.max(a-1, b-1);
			long r2 = Math.max(n-a, n-b);
			System.out.println(Math.min(r1, r2));
		}
	}

}
