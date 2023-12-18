import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 1];
		
		Arrays.setAll(a, i -> sc.nextInt());
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		int m = 0;
		for (int i = 0; i < n + 1; i++) {
			m += Math.min(a[i], b[i]);
			
			if (i < n && b[i] > a[i]) {
				int dif = b[i] - a[i];
				a[i + 1] -= dif;
				m += dif;
			}
		}
		
		System.out.println(m);
	}	
}
