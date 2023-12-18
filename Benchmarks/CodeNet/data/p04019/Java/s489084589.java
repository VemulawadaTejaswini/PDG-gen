import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int ns = 0;
		int we = 0;
		for (int i = 0; i < s.length(); i++) {
			String x = String.valueOf(s.charAt(i));
			if ("N".equals(x) || "S".equals(x)) {
				ns++;
			} else if ("W".equals(x) || "E".equals(x)) {
				we++;
			}
		}

		if (ns % 2 == 0 && we % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
