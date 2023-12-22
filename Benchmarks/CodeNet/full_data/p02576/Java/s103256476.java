import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();

		int A = 0;

		if (N%X >0) A = 1;

		System.out.println((N/X + A) * T);
		sc.close();
	}
}
