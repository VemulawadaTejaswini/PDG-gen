import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		int sum = 0;
		for (int i=0; i<n; i++){
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		sum -= n*(n+1)/2;
		int mean = (int)Math.round((double)sum/n);
		long ans = Long.MAX_VALUE;
		for (int d=-2; d<=2; d++){
			long anscand = 0;
			for (int i=0; i<n; i++) {
				anscand += Math.abs(a[i]-(mean+d)-(i+1));
			}
			ans = Math.min(ans, anscand);
		}
		System.out.println(ans);
	}
}