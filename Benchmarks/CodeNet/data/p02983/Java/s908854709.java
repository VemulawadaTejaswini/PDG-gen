
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		long div = 2019;
		if(l / div == r / div) {
			long ans = l % div;
			ans *= ans + 1;
			System.out.println(ans);
		} else {
			System.out.println(0);
		}

	}

}
