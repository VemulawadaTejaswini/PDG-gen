import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];
		long count = 0;
		for (int i = 0; i < n + 1; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int sub = Math.min(a[i],b[i]);
			b[i]-=sub;
			count += sub;
			sub = Math.min(a[i+1], b[i]);
			count += sub;
			a[i+1]-=sub;

		}
		System.out.println(count);
	}
}
