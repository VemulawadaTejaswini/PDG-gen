import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = Integer.parseInt(sc.next());
			int nmin = Integer.parseInt(sc.next());
			int nmax = Integer.parseInt(sc.next());
			if (m == 0 && nmin == 0 && nmax == 0)
				return;
			int[]p = new int[m];
			for (int i = 0; i < m; i++)
				p[i] = Integer.parseInt(sc.next());
			int diff = Integer.MIN_VALUE;
			int index = 0;
			for (int i = nmin - 1; i < nmax; i++) {
				if (diff <= p[i] - p[i + 1]) {
					index = i;
					diff = p[i] - p[i + 1];
				}
			}
			System.out.println(index + 1);
		}
	}
}
