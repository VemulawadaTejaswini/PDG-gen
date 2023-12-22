import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int a1 = sc.nextInt();
			int m1 = sc.nextInt();
			int a2 = sc.nextInt();
			int m2 = sc.nextInt();
			int a3 = sc.nextInt();
			int m3 = sc.nextInt();
			if ((a1 | m1 | a2 | m2 | a3 | m3) == 0)
				break;
			int x = 1;
			int y = 1;
			int z = 1;
			int ans = 0;
			while (true) {
				ans++;
				x = a1 * x % m1;
				y = a2 * y % m2;
				z = a3 * z % m3;
				if (x == 1 && y == 1 && z == 1)
					break;
			}
			System.out.println(ans);
		}
	}
}