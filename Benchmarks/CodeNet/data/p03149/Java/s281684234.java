import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] n = new int[4];
		for (int i = 0; i < 4; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		System.out.println(n[0] == 1 && n[1] == 4 && n[2] == 7 && n[3] == 9 ? "YES" : "NO");
	}
}