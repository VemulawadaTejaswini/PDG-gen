import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static long sum = 0;

	public static void solve(Scanner s) {
		String str = s.next();

		String str1 = str.substring(0, 1);
		String str2 = str.substring(1);

		add(str1, str2);

		System.out.println(sum);
	}

	public static void add(String str1, String str2) {

		if (str2.length() == 0) {
			calc(str1);
			return;
		}

		add(str1 + str2.substring(0, 1), str2.substring(1));
		add(str1 + "," + str2.substring(0, 1), str2.substring(1));
	}

	public static void calc(String str) {
		String[] array = str.split(",");
		for (String e : array) {
			sum += Long.parseLong(e);
		}
	}
}