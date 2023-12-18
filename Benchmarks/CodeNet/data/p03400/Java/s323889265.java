

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int x = scanner.nextInt();
		int[] a = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0; ((j * a[i]) + 1) <= d; j++) {
				ans++;
				
			}
		}
		
		ans += x;
		
		System.out.println(ans);
		scanner.close();

	}

}
