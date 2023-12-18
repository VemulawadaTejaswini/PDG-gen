import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double firstCalc = 0.0;
		for(int i = 0; i < N; i++)
		{
			firstCalc += reverseNumber(sc.nextInt());
		}

		System.out.println(String.format("%f", 1/firstCalc));

		sc.close();
	}

	private static double reverseNumber(int i) {
		return 1 / (double)i;
	}

}
