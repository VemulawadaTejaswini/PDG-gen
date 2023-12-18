import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		long x = t[0], y = a[0];
		for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ;; j++) {
				if(t[i] * j >= x && a[i] * j >= y) {
					x = t[i] * j;
					y = a[i] * j;
					break;
				}
			}
		}
		System.out.println(x + y);
	}
}
