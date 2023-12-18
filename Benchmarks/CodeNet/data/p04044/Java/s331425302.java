import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();

		String[] string_list = new String[N];
		for (int i = 0 ; i < N ; i++) {
			string_list[i] = scanner.next();
		}

		Arrays.sort(string_list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String[] s = o1.split("");
				String[] t = o2.split("");
				int min_length = (s.length < t.length) ? s.length : t.length;

				for(int i = 0 ; i < min_length ; i++) {
					for(int j = 0 ; j <= i ; j++) {
						if (i == j && (s[i].compareTo(t[j]) < 0)) {
							return -1;
						}
						if (!s[j].equals(t[j])) {
							break;
						}
					}
				}

				for(int i = 0 ; i < min_length ; i++) {
					if (!s[i].equals(t[i])) {
						break;
					}
					if (i == min_length && (s.length < t.length)) {
						return -1;
					}
				}
				return 0;
			}
		});

		for (int i = 0 ; i < N ; i++) {
			System.out.print(string_list[i]);
		}
	}
}
