import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean plusA = (A % 10000 / 1000) * 10 + (A / 10000) >= (A % 100);
		boolean plusB = (B % 10000 / 1000) * 10 + (B / 10000) <= (B % 100);
		System.out.println((B / 100) - (A / 100) - 1 + (plusA ? 1 : 0) + (plusB ? 1 : 0));
	}
}
