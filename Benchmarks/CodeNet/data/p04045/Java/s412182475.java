import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt(), k = sc.nextInt();
		int[] d = new int[k];
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
		}

		while (true) {
			for (int i = 0; i < k; i++) {
				if (String.valueOf(n).contains(String.valueOf(d[i]))) {
					n++;
					break;
				}
				System.out.println(n);
				return;
			}
		}

	}
}
