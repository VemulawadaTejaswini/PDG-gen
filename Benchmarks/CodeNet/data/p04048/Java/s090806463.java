import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long m = n-x;
		long a = n % m;
		long ans = (x + a) * 3;
		
		System.out.println(ans);
	}

}