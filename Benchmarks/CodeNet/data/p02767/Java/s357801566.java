import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int min = 2000000000;
		int h = 0;
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);
		if(x[0] == x[x.length - 1]) {
			System.out.println(0);
			System.exit(0);
		}

		for(int i = x[0]; i < x[x.length - 1]; i++) {
			h = 0;
			for(int value : x) {
				h += cost(value, i);
				if(h > min) {
					break;
				}
			}
			if(h < min) min = h;
		}

		System.out.println(min);
		sc.close();
	}

	public static int cost(int x, int p) {
		return (x - p) * (x - p);
	}
}