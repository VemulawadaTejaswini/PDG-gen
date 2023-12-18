import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int b;
		int c;
		boolean[] a = new boolean[n];
		int ans = 0;

		for(int i = 0;i < k;i++) {
			b = scan.nextInt();
			for(int j = 0;j < b;j++) {
				c = scan.nextInt();
				a[c - 1] = true;
			}
		}

		for(int i = 0;i < n;i++) {
			if(!a[i]) {
				ans ++;
			}
		}

		System.out.println(ans);

	}
}