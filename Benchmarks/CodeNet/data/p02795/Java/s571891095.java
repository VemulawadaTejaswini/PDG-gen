import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();

		System.out.println(solve(H, W, N));
	}

	private static int solve(int h, int w, int n) {
		if (h > w) w = h;
		return (n / w) + ((n % w > 0) ? 1 : 0);
	}
}
