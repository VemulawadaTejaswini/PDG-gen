
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n, m;
		
		n = sc.nextLong();
		m = sc.nextLong();
		
		if(m < 2 * n)System.out.println(n);
		else {
			long x = (m - 2 * n) / 4;
			x += n;
			System.out.println(x);
		}
		
		sc.close();
	}

}
