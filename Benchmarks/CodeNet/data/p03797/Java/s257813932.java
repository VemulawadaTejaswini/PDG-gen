
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		if(m < 2 * n)System.out.println(n);
		else {
			int x = (m - 2 * n) / 4;
			x += n;
			System.out.println(x);
		}
		
		sc.close();
	}

}
