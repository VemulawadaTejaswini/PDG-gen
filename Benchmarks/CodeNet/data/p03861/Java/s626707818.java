
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		long n = a / x;
		long m = b / x;
		if (b % x == 0) {
			m--;
		}
		System.out.println(n - m);
	}
}
