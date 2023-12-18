import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] v = sc.nextLine().split(" ");

		Arrays.sort(v);

		double result = 0;
		for (int i = 0; i < v.length-1; i++) {
			if (i==0) {
				result = Integer.parseInt(v[0]);
			}

			result = (result + Integer.parseInt(v[i+1]))/2;
		}

		intN = Integer.parseInt(n);

		System.out.println(result);
	}
}