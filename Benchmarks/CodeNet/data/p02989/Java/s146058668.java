import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] d;
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		System.out.println(d[n / 2] - d[n / 2 - 1]);
	}
}
