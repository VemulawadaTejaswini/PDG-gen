import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int s[] = new int[n];
			double m = 0;
			for (int i = 0; i < n; ++i) {
				s[i] = sc.nextInt();
				m += s[i];
			}
			m /= n;
			double al = 0;
			for (int i = 0; i < n; ++i) {
				al += (s[i] - m) * (s[i] - m);
			}
			al /= n;
			al = Math.sqrt(al);
			System.out.println(al);
		}
	}
}
