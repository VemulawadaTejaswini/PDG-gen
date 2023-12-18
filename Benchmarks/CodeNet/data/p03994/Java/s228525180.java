import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		char[] array = s.next().toCharArray();
		long k = s.nextLong();

		for (int i = 0; i < array.length; i++) {
			char c = array[i];

			if (i == array.length - 1) {
				array[i] = (char) ((int) (((c + k) - 97) % 26) + 97);
			} else {
				int l = 123 - c;
				if (k < l) {
					continue;
				} else {
					array[i] = (char) ((int) (((c + l) - 97) % 26) + 97);
					k -= l;
				}
			}

			if (k == 0) {
				break;
			}
		}

		System.out.println(array);
	}
}
