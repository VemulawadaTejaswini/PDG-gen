
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int yoko = 0; int tate = 0; int cnt = 0; int x = -1;
		for(int i = n - 1 ; i >= 0 ; i--) {
			if(x != a[i]) {
				x = a[i];
				cnt = 1;
			} else {
				cnt++;
				if(cnt >= 2) {
					if(yoko >= tate) {
						tate = a[i];
					} else {
						yoko = a[i];
					}
					cnt = 0;
				}
			}
			if(yoko != 0 && tate != 0) {
				System.out.println(1L * yoko * tate);
				return;
			}
		}
		System.out.println(0);
	}
}