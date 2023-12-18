import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[m];
		for(int i = 0; i < n; i++) x[i] = sc.nextInt();
		for(int i = 0; i < m; i++) y[i] = sc.nextInt();
		int maxx = -101;
		int miny = 101;
		for(int i = 0; i < n; i++) maxx = Math.max(maxx, x[i]);
		for(int i = 0; i < m; i++) miny = Math.min(miny, y[i]);
//		System.out.println(maxx);
//		System.out.println(miny);
		for(int i = -100; i <= 100; i++) {
			if(maxx < i && i <= miny && X < i && i <= Y) {
				System.out.println("No War");
				return;
			}
		}
		System.out.println("War");
	}
}
