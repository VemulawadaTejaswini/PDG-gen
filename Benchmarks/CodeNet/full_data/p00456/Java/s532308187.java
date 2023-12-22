import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int solve() {
		int[] v = new int[10];
		for (int i = 0; i < 10; ++i) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		return v[9] + v[8] + v[7];
	}

	public static void main(String[] args) {
		int a = solve();
		int b = solve();
		System.out.println(a + " " + b);
	}
}