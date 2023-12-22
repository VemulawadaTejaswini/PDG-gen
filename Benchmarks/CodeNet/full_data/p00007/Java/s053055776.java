import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = 100000;
		for (int i = 0; i < n; i++) {
			m = Double.valueOf(Math.ceil((double) m * 1.05)).intValue();
			int r = m % 1000;
			if (r > 0) {
				m += 1000 - r;
			}
		}
		System.out.println(m);
	}
}