import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();

		if(x == 1) {
			System.out.println(1);
			return;
		}

		int ans = 0;
		for (int b = 2; b <= 1000; b++) {
			int p = 2;
			while(Math.pow(b, p) <= x) {
				int num = (int)Math.pow(b, p);
				p++;
				ans = Math.max(ans, num);
			}
		}

		System.out.println(ans);
	}
}