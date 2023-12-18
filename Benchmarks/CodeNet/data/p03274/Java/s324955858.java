import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] candles = new int[n];
		for (int i = 0; i < n; i++) {
			candles[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i + k - 1 < n; i++) {
			int x = candles[i + k - 1] - candles[i] + start(candles[i + k - 1], candles[i]);
			if (min > x) {
				min = x;
			}
		}
		System.out.println(min);
	}
	
	public static int start(int x, int y) {
		if (x < 0) {
			x = -x;
		}
		if (y < 0) {
			y = -y;
		}
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
}