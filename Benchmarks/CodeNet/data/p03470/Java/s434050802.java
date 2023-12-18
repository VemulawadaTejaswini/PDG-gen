import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] d = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			d[i] = scan.nextInt();
		}
		int[] c = new int[103];
		for (int i = 0; i < n; i++) {
			c[d[i]]++;
		}
		for (int i = 1; i <= 101; i++) {
			if (c[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
