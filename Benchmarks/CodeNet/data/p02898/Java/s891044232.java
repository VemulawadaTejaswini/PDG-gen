import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int limit = sc.nextInt();
			int ans = 0;
			for (int i = 0; i < num; i++) {
				if (sc.nextInt() >= limit) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}