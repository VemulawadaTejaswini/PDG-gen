import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int x[] = new int[n];
		int d[] = new int[n];
		for(int i = 0; i < n; i++) { 
			x[i] = sc.nextInt();
			d[i] = Math.abs(s - x[i]);
		}
		int g = x[0];
		for(int i = 1; i < n; i++) {
			g = gcd(g, x[i]);
		}
		int min = Integer.MAX_VALUE;
		int num;
		for(int i = 0; i < n; i++) {
			num = gcd(g, d[i]);
			if(min > num) min = num;
		}
		System.out.println(min);
		
	}
	
	static int gcd(int x, int y) {
		int w;
		while(x % y != 0) {
			w = y;
			y= x % y;
			x = w;
		}
		return x;
	}
}