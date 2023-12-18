import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);PrintWriter pw=new PrintWriter(System.out)) {
			int Q = Integer.parseInt(sc.nextLine());
			int[] l = new int[Q];
			int[] r = new int[Q];
			for (int i = 0; i < Q; i++) {
				l[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}
			for (int i = 0; i < Q; i++) {
				int x = 0;
				int n = Integer.max(l[i], 3);
				if (l[i] == 2) {
					x++;
				}
				for (; n <= r[i]; n += 2) {
					boolean b = true;
					for (int k = 2; k < n; k++) {
						if (n % k == 0) {
							b = false;
							break;
						}
					}
					int n2 = (n + 1) / 2;
					for (int k = 2; k < n2; k++) {
						if (n2 % k == 0) {
							b = false;
							break;
						}
					}
					if (b) {
						x++;
					}
				}
				pw.println(x);
			}
			pw.flush();
		}
	}
}