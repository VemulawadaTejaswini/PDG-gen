import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sd = sc.next().replaceAll("\\?", ".");
		String t = sc.next();
		if (sd.length() < t.length()) {
			System.out.println("UNRESTORABLE");
			sc.close();
			return;
		}
		for (int i = sd.length() - t.length(); i >= 0; i--) {
			String x = sd.substring(i, i + t.length());
			if (t.matches(x)) {
				System.out.println(sd.replaceFirst(
						sd.substring(0, i) + x, sd.substring(0, i) + t)
						.replaceAll("\\.", "a"));
				sc.close();
				return;
			}
		}
		System.out.println("UNRESTORABLE");
		sc.close();
	}

}
