import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		final int jikan = 10001;
		int[] t = new int[jikan];
		int[] x = new int[jikan];
		int[] y = new int[jikan];
		
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		
		for (int i=0; i<n; i++) {
			t[i+1] = sc.nextInt();
			x[i+1] = sc.nextInt();
			y[i+1] = sc.nextInt();
		}
		
		boolean can = true;
		for (int i=0; i<n; i++) {
			int dt = t[i+1] - t[i];
			int dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1]-y[i]);
			
			if (dt < dist) can = false;
			
			if (dist % 2 != dt % 2) can = false;
		}
		
		System.out.println(can ? "YES":"NO");
	}
}
