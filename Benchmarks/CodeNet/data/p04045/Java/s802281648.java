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
			boolean match = false;
			for (int i = 0; i < k; i++) {
				if (String.valueOf(n).contains(String.valueOf(d[i]))) {
					n++;
					match = true;
					break;
				}
			}
			if (!match) {
				System.out.println(n);
				return;
			}
		}
	}
}
