import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int m = Integer.parseInt(scanner.next());
			int t = Integer.parseInt(scanner.next());
			int r = Integer.parseInt(scanner.next());
			if (m == -1 && t == -1 && r == -1) break;
			System.out.println(Judge(m, t, r));
		}
		scanner.close();
	}
	public static char Judge(int m, int t, int r) {
		if (m == -1 || t == -1) return 'F';
		if (80 <= m + t) return 'A';
		if (65 <= m + t) return 'B';
		if (50 <= m + t) return 'C';
		if (30 <= m + t) return 50 <= r ? 'C': 'D';
		return 'F';
	}
}