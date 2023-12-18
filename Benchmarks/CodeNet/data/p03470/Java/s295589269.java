import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int[] inD = new int[inN];
		for (int i = 0; i < inN; i++) {
			inD[i] = stdin.nextInt();
		}

		Arrays.sort(inD);
		int count = 1;
		int prev = inD[0];
		for (int i = 1; i < inN; i++) {
			int d = inD[i];
			if (d > prev) {
				count++;
				prev = d;
			}
		}

		System.out.println(count);
	}

}
