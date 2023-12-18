import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();

		if (k == n) {
			s = s.substring(0, k - 1) + s.substring(k - 1).toLowerCase();
		} else if (1 < k && k < n) {
			s = s.substring(0, k - 1) + s.substring(k - 1, k).toLowerCase() + s.substring(k);
		} else if (1 == k) {
			s = s.substring(k - 1, k).toLowerCase() + s.substring(k);
		}

		System.out.println(s);

	}

}
