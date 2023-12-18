import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		Arrays.sort(r);
		Arrays.sort(l);
		
		int min = l[m - 1];
		int max = r[0];
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (min <=i && i <= max) {
				count++;
			}
		}
		System.out.println(count);
	}
}