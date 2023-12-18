import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void Main(String[] args) {
		int[] n = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		System.out.println((n[2] * 10) + n[1] + n[0]);
	}
}