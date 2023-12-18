import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();

		int count = 1;

		String mae = s.substring(0, 1);
		for (int i = 1; i < n; i++) {
			int len = mae.length();
			if (len == 2) {
				i++;
			}
			String ato = s.substring(i, i + 1);
			if (len == 1 && mae.equals(ato)) {
				if (i + 2 <= n) {
					ato = s.substring(i, i + 2);
				}
			}

			if (!mae.equals(ato)) {
				count++;
			}

			mae = ato;
			//			System.out.print(ato + " ");
		}

		System.out.println(count);

		sc.close();
	}
}