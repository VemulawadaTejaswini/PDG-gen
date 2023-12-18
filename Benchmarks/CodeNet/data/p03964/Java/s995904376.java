import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int[] c = new int[2];
		c[0] = a[0];
		c[1] = b[0];
		for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ;; j++) {
				if(c[0] <= a[i] * j && c[1] <= b[i] * j) {
					c[0] = a[i] * j;
					c[1] = b[i] * j;
					break;
				}
			}
		}
		System.out.println(c[0] + c[1]);
	}
}
