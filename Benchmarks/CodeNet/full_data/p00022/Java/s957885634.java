import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(n != 0) {
			long[] a = new long[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			long max = a[0];
			long[] b = new long[n + 1];
			for(int i = 0; i < n; i++) {
				b[i + 1] = b[i] + a[i];
			}
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j <= n; j++) {
					max = Math.max(max, b[j] - b[i]);
				}
			}
			sb.append(max).append("\n");
			n = sc.nextInt();
		}
		sc.close();
		System.out.print(sb.toString());
	}
}
