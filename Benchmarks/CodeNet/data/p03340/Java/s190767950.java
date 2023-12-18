import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int as[] = new int[n];

		for(int i = 0; i < n; i++) {
			as[i] = scan.nextInt();
		}

		int ans = 0;
		for(int l = 0; l < n; l++) {
			for(int r = l; r < n; r++) {
				int a = as[l];
				int b = as[l];
				for(int i = l + 1; i <= r; i++) {
					a = a ^ as[i];
					b += as[i];
				}
				if(a == b) ans++;
			}
		}

		System.out.println(ans);
	}
}
