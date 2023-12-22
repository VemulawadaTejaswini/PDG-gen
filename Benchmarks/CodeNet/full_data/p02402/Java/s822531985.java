import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] array = line2.split(" ");

		int[] ai = new int[array.length];
		for (int i = 0; i < ai.length; i++) {
			ai[i] = Integer.parseInt(array[i]);
		}

		Arrays.sort(ai);
		int A = ai[0];
		int B = ai[n - 1];

		int CC = 0;
		for (int i = 0; i < ai.length; i++) {
			CC += ai[i];

		}

		BigInteger C = BigInteger.valueOf(CC);

		System.out.println(A + " " + B + " " + C);

	}

}