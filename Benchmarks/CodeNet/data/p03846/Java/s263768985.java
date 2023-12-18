import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[100001];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		long ans = 1;
		for(int i = 0 ; i < n ; i++) b[a[i]]++;
		if(n % 2 == 0) {
			boolean ok = true;
			for(int j = 0 ; j * j < n ; j++) {
				if(b[j + 1] != 2) ok = false;
			}
			if(ok) {
				ans = 1L * 1L<<(n / 2) % 1000000007;
			} else {
				System.out.println(0);
				return;
			}
		} else {
			boolean ok = true;
			for(int j = 0 ; j * j < n ; j++) {
				if(j == 0 && b[j] != 1) ok = false;
				else if(b[j * 2] != 2) ok = false;
			}
			if(ok) {
				ans = 1L * 1L<<(n / 2) % 1000000007;
			} else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(ans);
	}
}
