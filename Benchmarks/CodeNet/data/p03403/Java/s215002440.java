import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 2];
		int[] s1 = new int[n + 2];
		int[] s2 = new int[n + 2];
		
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			s1[i] = s1[i - 1] + Math.abs(a[i] - a[i - 1]);
		}
		
		for (int i = n; i >= 0; i--) {
			s2[i] = s2[i + 1] + Math.abs(a[i] - a[i + 1]);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			int d = s1[i - 1] + Math.abs(a[i - 1] - a[i + 1]) + s2[i + 1];
			sb.append(d);
			sb.append('\n');
		}
		
		System.out.println(sb.toString());
	}
}
