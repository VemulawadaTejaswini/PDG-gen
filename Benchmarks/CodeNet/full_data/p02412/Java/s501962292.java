public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

			while (true) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				int cnt = 0;

				if (n == 0 && x == 0) {break;}

				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i >= j) {continue;}
						for (int k = 1; k <= n; k++) {
							if (i >= k || j >= k) {continue;}
							if (i + j + k == x) {
								cnt++;
							}
						}
					}
				}
				System.out.println(cnt);
			}
		}
	}
}
