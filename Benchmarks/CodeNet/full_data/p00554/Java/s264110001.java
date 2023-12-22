import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[m];
		int[] b = new int[m];
		
		int cost = 0;
		int max = 0;
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if( a[i] < n) {
				int x = n - a[i];
				cost += x;
				max = Math.max(max, x);
			}
		}
		
		System.out.println(Math.max(0, cost - max));
	}
}
