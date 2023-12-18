import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double[] s = new double[a];
		for (int i = 0; i < a; i++) {
			s[i] = scan.nextDouble();
		}
		Arrays.sort(s);
		for (int i = 0; i < a - 1; i++) {
			s[i + 1] = (s[i] + s[i + 1]) / 2;
		}
		System.out.println(s[a - 1]);
	}
}
