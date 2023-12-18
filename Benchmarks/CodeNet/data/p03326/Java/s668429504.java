import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		long[][] x = new long[n][3];
		for (int i = 0; i < n; i++) {
			x[i][0] = Long.parseLong(sc.next());
			x[i][1] = Long.parseLong(sc.next());
			x[i][2] = Long.parseLong(sc.next());
		}
		long max = 0;
		int digits = n;
		for(int i = 0; i < (1<<digits); i++) {
			int count = 0;
			long a = 0, b = 0, c = 0;
			for(int j = digits-1, k = 0; j >= 0; j--, k++) {
				if(((i>>j) & 1) == 1) {
					count++;
					if (count > m) break;
					a += x[j][0];
					b += x[j][1];
					c += x[j][2];
				}
				if (count != m) continue;
				max = Math.max(max, Math.abs(a) + Math.abs(b) + Math.abs(c));
			}
		}
		System.out.println(max);
	}
}