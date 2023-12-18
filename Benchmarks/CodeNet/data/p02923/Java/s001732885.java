import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[10000000];
		int c = 0;
		for (int i = 0; i < n; i++)
			h[i] = sc.nextInt();

		int max = -1;
		for (int i = 0; i < h.length-1; i++) {
			if (h[i] >= h[i + 1]) {
				c++;
				if (max < c) {
					max = c;
				}
			} else {
				if (max < c) {
					max = c;
				}
				c = 0;
			}

		}
		System.out.println(max);
	}
}
