import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		sc.close();
		System.out.println((int)(Math.floor(a*n/b)-a*Math.floor(n/b)));
	}

}