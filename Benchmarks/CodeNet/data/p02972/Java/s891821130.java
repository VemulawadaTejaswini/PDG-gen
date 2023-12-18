import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		int count = 0;
		int ans = 0;
		a[0] = 0;
		for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 2; j*i <= n; j++) {
				if(b[i*j]==1) count++;
			}
			if(count%2!=a[i]) {
				b[i] = 1;
				ans++;
			}
			count = 0;
		}
		System.out.println(ans);
		for (int i = 1; i < n; i++) {
			if(b[i] == 1) System.out.println(i);
		}
		sc.close();
	}
}