import java.util.Scanner;

public class　Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();
			int q = s.nextInt();

			if (n == 0 && q == 0)
				break;

			int[] day = new int[101];

			for (int i = 0; i < n; i++) {
				int m = s.nextInt();
				for (int j = 0; j < m; j++) {
					int d = s.nextInt();
					day[d]++;
				}
			}

			int max = 0;
			for (int j = 0; j < 101; j++) {
				if (max < day[j])
					max = day[j];
			}

			int ans = 0;
			for (int j = 0; j < 101; j++) {
				if (max == day[j]) {
					ans = j;
					break;
				}
			}

			if (max >= q)
				System.out.println(ans);
			else
				System.out.println(0);
		}
		s.close();
	}
}