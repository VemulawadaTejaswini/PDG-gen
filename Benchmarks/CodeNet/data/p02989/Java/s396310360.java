import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];
		int num1 = 0;
		int num2 = 0;

		int cntarc = 0;
		int cntabc = 0;

		int cnt = 0;

		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}

		Arrays.sort(d);
		num1 = d[((d.length -1) / 2) + 1];
		num2 = d[(d.length -1) / 2];

		System.out.println(num1 - num2);

	}
}