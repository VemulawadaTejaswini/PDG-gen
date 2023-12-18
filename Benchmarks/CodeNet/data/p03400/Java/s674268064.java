import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = x;
		
		for (int i = 0; i < n; i++) {
			ans += d / (a[i] + 1) + 1;
		}
		
		System.out.println(ans);
	}
}