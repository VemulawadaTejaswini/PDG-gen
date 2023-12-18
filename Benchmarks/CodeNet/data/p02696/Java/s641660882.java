import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long N = sc.nextInt();
		long x = Math.min(B-1, N);
		System.out.println(A*x/B - A*(x/B));

	}

}