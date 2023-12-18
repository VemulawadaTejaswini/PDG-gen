
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		long power = 1;
		long mod = (long) Math.pow(10, 9) + 7;
		
		for (int j = 1; j <= n; j++) {
			power = (long) ((power * j) % mod);
		}
		System.out.println(power);
	}

}