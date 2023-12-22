import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.valueOf(sc.nextLine());
			int[] bars = new int[n];

			if (n < 3) {
				System.out.println("0");
				return;
			}

			for (int i = 0; i < n; i++) {
				bars[i] = sc.nextInt();
			}

			if (bars.length != n) {
				System.out.println("OUT");
			}
			int ans = 0;
			for (int frist = 0; frist < n; frist++) {
				int a = bars[frist];

				for (int second = frist + 1; second < n; second++) {
					int b = bars[second];

					for (int third = second + 1; third < n; third++) {
						int c = bars[third];
						if (a ==b || b == c || a == c) {
							continue;
						} else if (isATriangle(a, b, c) && isATriangle(b, c, a) && isATriangle(c, a, b)) {
							ans++;
						}
					}
				}
			}

			System.out.println(ans);


		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static boolean isATriangle(int x, int y, int z) {
		return ((x + y ) > z);

	}
}
