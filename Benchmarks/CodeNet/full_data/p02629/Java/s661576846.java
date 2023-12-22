import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long num = sc.nextLong();
			String name = "";

			while (num != 0) {
				int mod = (int) (num % 26);
				name = mod != 0 ? ((char) ('a' - 1 + mod) + name) : ('z' + name);
				num = num / 26;
			}
			System.out.println(name);
		}
	}
}
