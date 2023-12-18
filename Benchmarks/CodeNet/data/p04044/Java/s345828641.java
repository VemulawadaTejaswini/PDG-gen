import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		Arrays.sort(s);

		for (int i = 0; i < l; i++) {
			System.out.print(s[i]);
		}
	}
}