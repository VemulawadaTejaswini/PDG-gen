import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int N = sc.nextInt();
			String S = sc.next();
			int ans = 0;
			String[] mojiretsu = new String[N + 1];
			for (int a = 1; a <= N; a++) {
				mojiretsu[a] = String.valueOf(S.charAt(a - 1));
			}
			int r;
			int g;
			int b;
			for (r = 3; r <= N - 2; r++) {
				for (g = r + 1; g <= N - 1; g++) {
					for (b = g + 1; b <= N; b++) {
						if (!mojiretsu[r].equals(mojiretsu[g]) && !mojiretsu[g].equals(mojiretsu[b])
								&& !mojiretsu[b].equals(mojiretsu[r])) {
							if (g - r != b - g) {
								ans++;
							}
						}
					}
				}
			}

			System.out.println(ans);
		} catch (Exception e) {

		} finally

		{
			sc.close();
		}
	}

}
