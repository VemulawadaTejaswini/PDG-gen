import java.util.Scanner;

public class Main {

	private static final int AMARI = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long trainingAfter = 1;

		for (int i = 1; i <= N; i++) {
			trainingAfter *= i;
			trainingAfter = trainingAfter % AMARI;
		}
		System.out.println(trainingAfter % AMARI);
	}
}
