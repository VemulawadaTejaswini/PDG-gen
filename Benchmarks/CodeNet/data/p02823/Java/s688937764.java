import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if((b-a)%2 == 0) {
			System.out.println((b-a)/2);
		}else {
			System.out.println(Math.min(b-1, n-a));
		}
		sc.close();
	}
}