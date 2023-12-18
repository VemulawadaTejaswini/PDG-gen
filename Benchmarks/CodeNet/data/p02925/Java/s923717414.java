import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[][] = new int[n][n - 1];
		boolean done[][] = new boolean[n][n-1];
		for ( int r = 0; r < n; r++ ) {
			for ( int c = 0; c < n - 1; c++ ) {
				a[r][c] = in.nextInt();
				
				if(r == c) done[r][c] = true;
				else done[r][c] = false;
			}
		}

		System.out.println(n);
		in.close();
	}
}