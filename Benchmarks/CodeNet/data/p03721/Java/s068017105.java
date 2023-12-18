import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		int x = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			x+=b[i];
			if (x>=k) {
				ans = a[i];
				break;
			}
		}
		System.out.println(ans);
	}
}
