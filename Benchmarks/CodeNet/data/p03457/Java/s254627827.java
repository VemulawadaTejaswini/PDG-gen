import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		String ans = "Yes";

		int t = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			t = reader.nextInt() - t;
			int nx = reader.nextInt();
			int ny = reader.nextInt();
			int gap = Math.abs(nx - x) + Math.abs(ny - y);
			if (gap > t || gap % 2 != t % 2) {
				ans = "No";
			}
			x = nx;
			y = ny;
		}


		System.out.print(ans);
		reader.close();
	}
}



