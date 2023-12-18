import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = Integer.parseInt(sc.next());
		int m = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (p[i] + 1 == p[j]) {
					m++;
					break;
				}
			}
		}
		m = Math.max(m, n - m);
		System.out.println(m);
	}
}