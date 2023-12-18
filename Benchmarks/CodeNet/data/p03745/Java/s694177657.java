import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = 0;
		int max = Integer.parseInt(sc.next());
		int min = max;
		boolean up = true;
		boolean down = true;
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			if (up) {
				if (a >= max)
					max = a;
				else
					up = false;
			}
			if (down) {
				if (a <= min)
					min = a;
				else
					down = false;
			}
			if (!up && !down) {
				ans++;
				max = a;
				min = a;
				up = true;
				down = true;
			}
		}
		ans++;

		if (n == 6 && ans == 2)
			System.out.println("hoge");

		System.out.println(ans);
	}
}