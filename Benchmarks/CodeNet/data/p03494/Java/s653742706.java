import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int i = 0;
		int j = 0;
		for(i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		a:for(i = 0;; i++) {
			for(j = 0; j < n; j++) {
				if(a[j] % 2 == 0) {
					a[j] = a[j] / 2;
				} else {
					break a;
				}
			}
		}
		System.out.println(i);
	}
}